package com.challenge.eventmanagement.resources;

import java.time.LocalDateTime;

import com.fasterxml.jackson.annotation.JsonProperty;

public class EventResource {
   @JsonProperty
   private final Long id;

   @JsonProperty
   private final String name;

   @JsonProperty
   private final int vacancies;

   @JsonProperty
   private final LocalDateTime start;

   @JsonProperty
   private final LocalDateTime end;

   public EventResource(Long id, String name, int vacancies, LocalDateTime start, LocalDateTime end) {
      this.id = id;
      this.name = name;
      this.vacancies = vacancies;
      this.start = start;
      this.end = end;
   }

   public Long getId() {
      return id;
   }

   public String getName() {
      return name;
   }

   public int getVacancies() {
      return vacancies;
   }

   public LocalDateTime getStart() {
      return start;
   }
   public LocalDateTime getEnd() {
      return end;
   }
}
