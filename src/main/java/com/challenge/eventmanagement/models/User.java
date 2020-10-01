package com.challenge.eventmanagement.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="user")
public class User implements Serializable{
   
   /**
    *
    */
   private static final long serialVersionUID = 4757280793258730433L;

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private final Long id;

   private final String name;

   public User() {
      this.id = -1L;
      this.name = "";
   }

   public User(Long id, String name) {
      this.id = id;
      this.name = name;
   }

   public Long getId() {
      return id;
   }

   public String getName() {
      return name;
   }

}
