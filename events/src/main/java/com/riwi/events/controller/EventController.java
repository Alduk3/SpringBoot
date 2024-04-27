package com.riwi.events.controller;

import com.riwi.events.entity.Event;
import com.riwi.events.service.abstract_service.IEventService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/events")
@AllArgsConstructor
public class EventController {

    @Autowired
    private final IEventService eventService;

    @GetMapping
    public ResponseEntity<List<Event>> getAll() {
        return ResponseEntity.ok(this.eventService.getAll());
    }

    @GetMapping(path = "/{id}")
    public ResponseEntity<Event> getById(@PathVariable String id) {
        return ResponseEntity.ok(this.eventService.getById(id));
    }

    @PostMapping
    public ResponseEntity<Event> insert(@RequestBody Event event) {
        return ResponseEntity.ok(this.eventService.save(event));
    }

    @PutMapping(path = "/{id}")
    public ResponseEntity<Event> update(@PathVariable String id, @RequestBody Event event) {
        event.setId(id);
        return ResponseEntity.ok(this.eventService.update(event));
    }

    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable String id) {
        this.eventService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
