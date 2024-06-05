package com.riwi.riwiplatform.infrastructure.services;

import com.riwi.riwiplatform.api.dto.request.UserRequest;
import com.riwi.riwiplatform.api.dto.response.*;
import com.riwi.riwiplatform.domain.entities.*;
import com.riwi.riwiplatform.domain.repositories.UserRepository;
import com.riwi.riwiplatform.infrastructure.abstract_services.IUserService;
import com.riwi.riwiplatform.utils.enums.SortType;
import com.riwi.riwiplatform.utils.exceptions.BadRequestException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UserService implements IUserService {

    @Autowired
    private final UserRepository userRepository;

    @Override
    public UserResponse create(UserRequest request) {
        User user = this.requestToEntity(request);
        user.setEnrollments(new ArrayList<>());
        user.setCourses(new ArrayList<>());
        user.setSubmissions(new ArrayList<>());
        user.setMessages_receiver(new ArrayList<>());
        user.setMessages_sender(new ArrayList<>());

        return this.entityToResponse(this.userRepository.save(user));
    }

    @Override
    public UserResponse get(Long id) {
        return this.entityToResponse(this.find(id));
    }

    @Override
    public UserResponse update(UserRequest request, Long id) {
        User user = this.find(id);

        User userUpdate = this.requestToEntity(request);
        userUpdate.setId(id);
        userUpdate.setEnrollments(user.getEnrollments());
        userUpdate.setCourses(user.getCourses());
        userUpdate.setSubmissions(user.getSubmissions());
        userUpdate.setMessages_receiver(user.getMessages_receiver());
        userUpdate.setMessages_sender(user.getMessages_sender());

        return this.entityToResponse(this.userRepository.save(userUpdate));
    }

    @Override
    public void delete(Long id) {
        this.userRepository.delete(this.find(id));

    }

    @Override
    public Page<UserResponse> getAll(int page, int size, SortType sort) {
        if(page < 0) page = 0;
        PageRequest pagination = null;

        switch (sort){
            case NONE -> pagination = PageRequest.of(page, size);
            case ASCENDING -> pagination = PageRequest.of(page, size, Sort.by(FIELD_BY_SORT).ascending());
            case DESCENDING -> pagination = PageRequest.of(page, size, Sort.by(FIELD_BY_SORT).descending());
        }
        return this.userRepository.findAll(pagination).map(this::entityToResponse);
    }

    private User find(Long id) {
        return this.userRepository.findById(id).orElseThrow(()-> new BadRequestException("user not found"));
    }

    private UserResponse entityToResponse(User user) {
        List<EnrollmentBasicResponse> enrollments = user.getEnrollments().stream().map(this::entityToEnrollmentBasicResponse).toList();
        List<CourseBasicResponse> courses = user.getCourses().stream().map(this::entityToCourseBasicResponse).toList();
        List<SubmissionBasicResponse> submissions = user.getSubmissions().stream().map(this::entityToSubmissionBasicResponse).toList();
        List<MessageBasicResponse> messages_receiver = user.getMessages_receiver().stream().map(this::entityToMessageBasicResponse).toList();
        List<MessageBasicResponse> messages_sender = user.getMessages_sender().stream().map(this::entityToMessageBasicResponse).toList();

        return UserResponse.builder()
                .id(user.getId())
                .username(user.getUsername())
                .password(user.getPassword())
                .email(user.getEmail())
                .full_name(user.getFull_name())
                .role(user.getRole())
                .enrollments(enrollments)
                .courses(courses)
                .submissions(submissions)
                .messages_receiver(messages_receiver)
                .messages_sender(messages_sender)
                .build();
    }

    private EnrollmentBasicResponse entityToEnrollmentBasicResponse(Enrollment enrollment) {
        return EnrollmentBasicResponse.builder()
                .id(enrollment.getId())
                .enrollmentDate((enrollment.getEnrollmentDate()))
                .build();
    }
    private CourseBasicResponse entityToCourseBasicResponse(Course course) {
        return CourseBasicResponse.builder()
                .id(course.getId())
                .name(course.getName())
                .description(course.getDescription())
                .build();
    }
    private SubmissionBasicResponse entityToSubmissionBasicResponse(Submission submission) {
        return SubmissionBasicResponse.builder()
                .id(submission.getId())
                .content(submission.getContent())
                .submission_date(submission.getSubmission_date())
                .grade(submission.getGrade())
                .build();
    }
    private MessageBasicResponse entityToMessageBasicResponse(Message message) {
        return MessageBasicResponse.builder()
                .id(message.getId())
                .message(message.getMessage())
                .sentDate(message.getSentDate())
                .build();
    }

    private User requestToEntity(UserRequest request) {
        return User.builder()
                .username(request.getUsername())
                .password(request.getPassword())
                .email(request.getEmail())
                .full_name(request.getFull_name())
                .role(request.getRole())
                .build();

    }
}
