package com.riwi.events.service;

import com.riwi.events.entity.Event;
import com.riwi.events.repository.EventRepository;
import com.riwi.events.service.abstract_service.IEventService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class EventService implements IEventService {

    @Autowired
    private final EventRepository eventRepository;

    @Override
    public Event save(Event event) {
        return this.eventRepository.save(event);
    }

    @Override
    public List<Event> getAll() {
        return this.eventRepository.findAll();
    }

    @Override
    public Event getById(String id) {
        return this.eventRepository.findById(id).orElseThrow();
    }

    @Override
    public void delete(String id) {
        Event event = this.eventRepository.findById(id).orElseThrow();
        this.eventRepository.delete(event);

    }

    @Override
    public Event update(Event event) {
        return this.eventRepository.save(event);
    }
}
