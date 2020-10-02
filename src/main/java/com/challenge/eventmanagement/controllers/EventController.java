package com.challenge.eventmanagement.controllers;

import java.util.ArrayList;
import java.util.List;

import com.challenge.eventmanagement.models.Event;
import com.challenge.eventmanagement.models.Subscription;
import com.challenge.eventmanagement.models.User;
import com.challenge.eventmanagement.repositories.EventRepository;
import com.challenge.eventmanagement.repositories.SubscriptionRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EventController {
   @Autowired
   private EventRepository eventRepository;

   @Autowired
   private SubscriptionRepository subscriptionRepository;

   @PostMapping(path = "/events")
   public Event create(@RequestBody Event event) {
      Event newEvent = eventRepository.saveAndFlush(event);
      return newEvent;
   }

   @GetMapping(path = "/events/{id}/subscriptions")
   public List<User> user(@PathVariable (name="id", required = true) Long id) {
      Event event = eventRepository.findById(id).get();

      Subscription subscription = new Subscription();
      subscription.setEvent(event);
      Example<Subscription> subscriptionExample = Example.of(subscription);

      List<Subscription> allSubscriptions = subscriptionRepository.findAll(subscriptionExample);

      List<User> allUsers =  new ArrayList<User>();
      allSubscriptions.forEach(sub -> allUsers.add(sub.getUser()));

      return allUsers;
   }
}