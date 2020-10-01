package com.challenge.eventmanagement.repositories;

import com.challenge.eventmanagement.models.Event;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long>{
   
}
