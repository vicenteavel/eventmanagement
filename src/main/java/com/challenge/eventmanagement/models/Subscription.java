package com.challenge.eventmanagement.models;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="subscription")
public class Subscription {
   
   @Id
   private final long id;
   
   @ManyToOne
   @JoinColumn
   private final User user;

   @ManyToOne
   @JoinColumn
   private final Event event;


   public Subscription(long id, User user, Event event) {
      this.id = id;
      this.user = user;
      this.event = event;
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

}