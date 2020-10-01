package com.challenge.eventmanagement.controllers;

import com.challenge.eventmanagement.models.Event;
import com.challenge.eventmanagement.repositories.EventRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
   @Autowired
   private EventRepository eventRepository;

   @PostMapping(path = "/events")
   public Event create(@RequestBody Event event) {
      Event newEvent = eventRepository.saveAndFlush(event);
      return newEvent;
   }
}