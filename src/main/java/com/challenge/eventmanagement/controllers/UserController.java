package com.challenge.eventmanagement.controllers;

import com.challenge.eventmanagement.models.User;
import com.challenge.eventmanagement.repositories.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
// import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
   @Autowired
   private UserRepository userRepository;

   // @GetMapping(path = "/users")
   // public User user(@RequestParam(value="name", defaultValue = "") String name) {
   //    return new User(counter.incrementAndGet(), name);
   // }

   @PostMapping(path = "/users")
   public User create(@RequestBody User user) {
      User newUser = userRepository.saveAndFlush(user);
      return newUser;
   }
}