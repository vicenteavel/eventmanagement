package com.challenge.eventmanagement.repositories;

import com.challenge.eventmanagement.models.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
   
}
