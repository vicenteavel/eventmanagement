package com.challenge.eventmanagement.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="user")
public class User {
   
   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private final long id;

   private final String name;

   public User(long id, String name) {
      this.id = id;
      this.name = name;
   }

   public long getId() {
      return id;
   }

   public String getName() {
      return name;
   }

}
