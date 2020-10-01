package com.challenge.eventmanagement.models;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "event")
public class Event {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private final long id;

   private final String name;
   private final int vacancies;
   private final LocalDateTime start;
   private final LocalDateTime end;

   public Event(long id, String name, int vacancies, LocalDateTime start, LocalDateTime end) {
      this.id = id;
      this.name = name;
      this.vacancies = vacancies;
      this.start = start;
      this.end = end;
   }

   public long getId() {
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
