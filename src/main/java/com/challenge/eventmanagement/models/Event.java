package com.challenge.eventmanagement.models;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name = "event")
public class Event {

   @Id
   private final long id;

   private final String name;
   private final int vacancies;
   private final LocalDate start;
   private final LocalDate end;

   public Event(long id, String name, int vacancies, LocalDate start, LocalDate end) {
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

   public LocalDate getStart() {
      return start;
   }
   public LocalDate getEnd() {
      return end;
   }
}
