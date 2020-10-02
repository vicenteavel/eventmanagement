package com.challenge.eventmanagement.resources;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserResource {
   @JsonProperty
   private final Long id;

   @JsonProperty
   private final String name;

   public UserResource(Long id, String name) {
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
