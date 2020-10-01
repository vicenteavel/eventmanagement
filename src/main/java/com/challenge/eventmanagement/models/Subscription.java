package com.challenge.eventmanagement.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="subscription")
public class Subscription {
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private final long id;
   
   @ManyToOne
   @JoinColumn
   private final User user;

   @ManyToOne
   @JoinColumn
   private final Event event;

   private final boolean confirmed;

   public Subscription(long id, User user, Event event) {
      this.id = id;
      this.user = user;
      this.event = event;
      this.confirmed = false;
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