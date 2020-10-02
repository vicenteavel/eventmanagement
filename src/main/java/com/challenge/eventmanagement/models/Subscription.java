package com.challenge.eventmanagement.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity(name="subscription")
public class Subscription implements Serializable {
   
   /**
	 *
	 */
	private static final long serialVersionUID = 5710490216364764875L;

@Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private final Long id;
   
   @ManyToOne
   @JoinColumn
   private User user;

   @ManyToOne
   @JoinColumn
   private Event event;

   private boolean confirmed;

   public Subscription() {
      this.id = -1L;
      this.user = null;
      this.event = null;
      this.confirmed = false;
   }

   public Subscription(Long id, User user, Event event) {
      this.id = id;
      this.user = user;
      this.event = event;
      this.confirmed = false;
   }

   public Long getId() {
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

   public void setUser(User user) {
      this.user = user;
   }

   public void setEvent(Event event) {
      this.event = event;
   }

   public void setConfirmed(boolean confirmed) {
      this.confirmed = confirmed;
   }

}