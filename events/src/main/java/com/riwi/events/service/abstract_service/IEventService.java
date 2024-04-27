package com.riwi.events.service.abstract_service;

import com.riwi.events.entity.Event;

import java.util.List;

public interface IEventService {
    public Event save(Event event);
    public List<Event> getAll();
    public Event getById(String id);
    public void delete(String id);
    public Event update(Event event);
}
