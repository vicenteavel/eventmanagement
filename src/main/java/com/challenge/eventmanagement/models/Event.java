package com.challenge.eventmanagement.models;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name = "event")
public class Event implements Serializable{

   /**
    *
    */
   private static final long serialVersionUID = 1927323140597932187L;

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private final Long id;

   private final String name;
   private int vacancies;
   private final LocalDateTime start;
   private final LocalDateTime end;

   public Event() {
      this.id = -1L;
      this.name= "";
      this.vacancies = 0;
      this.start= null;
      this.end = null;
   }

   public Event(Long id, String name, int vacancies, LocalDateTime start, LocalDateTime end) {
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

   public void setVacancies(int vacancies) {
      this.vacancies = vacancies;
   }

   public String toString() {
      return "id: " + id + "  |  vacancies: " + vacancies + "  |  name: " + name + "\n";
   }
}
