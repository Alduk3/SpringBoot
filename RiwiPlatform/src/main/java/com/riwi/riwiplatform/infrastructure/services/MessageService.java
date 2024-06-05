package com.riwi.riwiplatform.infrastructure.services;

import com.riwi.riwiplatform.api.dto.request.MessageRequest;
import com.riwi.riwiplatform.api.dto.response.MessageResponse;
import com.riwi.riwiplatform.infrastructure.abstract_services.IMessageService;
import com.riwi.riwiplatform.utils.enums.SortType;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class MessageService implements IMessageService {
    @Override
    public MessageResponse create(MessageRequest request) {
        return null;
    }

    @Override
    public MessageResponse get(Long id) {
        return null;
    }

    @Override
    public MessageResponse update(MessageRequest request, Long id) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public Page<MessageResponse> getAll(int page, int size, SortType sort) {
        return null;
    }
}
