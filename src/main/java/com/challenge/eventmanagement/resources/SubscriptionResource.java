package com.challenge.eventmanagement.resources;

import com.challenge.eventmanagement.models.Event;
import com.challenge.eventmanagement.models.User;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SubscriptionResource {
   @JsonProperty
   private final Long id;

   @JsonProperty
   private final User user;

   @JsonProperty
   private final Event event;
   
   @JsonProperty
   private final Boolean confirmed;

   public SubscriptionResource(Long id, User user, Event event, Boolean confirmed) {
      this.id = id;
      this.user = user;
      this.event = event;
      this.confirmed = confirmed;
   }

   public long getId() {
      return id;
   }

   public User getUser() {
      return user;
   }

   public Event getEvent() {
      return event;
   }

   public boolean getConfirmed() {
      return confirmed;
   }
}
