package com.challenge.eventmanagement.controllers;

import java.time.LocalDateTime;

import com.challenge.eventmanagement.models.Event;
import com.challenge.eventmanagement.models.Subscription;
import com.challenge.eventmanagement.models.User;
import com.challenge.eventmanagement.repositories.EventRepository;
import com.challenge.eventmanagement.repositories.SubscriptionRepository;
import com.challenge.eventmanagement.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SubscriptionController {
   @Autowired
   private SubscriptionRepository subscriptionRepository;

   @Autowired
   private UserRepository userRepository;

   @Autowired
   private EventRepository eventRepository;

   @PostMapping(path="/subscriptions")
   public Subscription create(@RequestBody Subscription subscription) {
      Long event_id = subscription.getEvent().getId();
      Long user_id = subscription.getUser().getId();
      
      Event currentEvent = eventRepository.findById(event_id).get();
      User currentUser = userRepository.findById(user_id).get();

      int numberOfVacancies = currentEvent.getVacancies();
      if (numberOfVacancies < 1 ) {
         return null;
      }

      LocalDateTime now = LocalDateTime.now();
      if(currentEvent.getStart().isAfter(now)) {
         return null;
      }

      currentEvent.setVacancies(numberOfVacancies - 1);
      eventRepository.save(currentEvent);

      subscription.setEvent(currentEvent);
      subscription.setUser(currentUser);
      Subscription newSubscription = subscriptionRepository.saveAndFlush(subscription);

      return newSubscription;
   }

   @DeleteMapping(path = "/subscriptions/{id}")
   public boolean delete(@PathVariable (name="id", required = true) Long id) {
      Subscription subscription = subscriptionRepository.findById(id).get();

      if (subscription.getConfirmed()) return false;

      Long event_id = subscription.getEvent().getId();
      Event currentEvent = eventRepository.findById(event_id).get();
      int numberOfVacancies = currentEvent.getVacancies();

      subscriptionRepository.deleteById((id));
      currentEvent.setVacancies(numberOfVacancies + 1);
      eventRepository.save(currentEvent);
      return true;
   }
}
