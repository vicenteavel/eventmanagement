package com.challenge.eventmanagement.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserResource {
   @JsonProperty
   private final long id;

   @JsonProperty
   private final String name;

   public UserResource(long id, String name) {
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
