package com.challenge.eventmanagement.controllers;

import java.util.ArrayList;
import java.util.List;

import com.challenge.eventmanagement.models.Subscription;
import com.challenge.eventmanagement.models.User;
import com.challenge.eventmanagement.models.Event;
import com.challenge.eventmanagement.repositories.SubscriptionRepository;
import com.challenge.eventmanagement.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
   @Autowired
   private UserRepository userRepository;

   @Autowired
   private SubscriptionRepository subscriptionRepository;

   @PostMapping(path = "/users")
   public User create(@RequestBody User user) {
      User newUser = userRepository.saveAndFlush(user);
      return newUser;
   }

   @GetMapping(path = "/users/{id}/subscriptions")
   public List<Event> user(@PathVariable (name="id", required = true) Long id) {
      User user = userRepository.findById(id).get();

      Subscription subscription = new Subscription();
      subscription.setUser(user);
      Example<Subscription> subscriptionExample = Example.of(subscription);

      List<Subscription> allSubscriptions = subscriptionRepository.findAll(subscriptionExample);

      List<Event> allEvents =  new ArrayList<Event>();
      allSubscriptions.forEach(sub -> allEvents.add(sub.getEvent()));

      return allEvents;
   }
}