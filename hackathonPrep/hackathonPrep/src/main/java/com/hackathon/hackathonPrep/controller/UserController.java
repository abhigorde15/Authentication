package com.hackathon.hackathonPrep.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hackathon.hackathonPrep.model.User;
import com.hackathon.hackathonPrep.service.UserService;

@RestController
@CrossOrigin(origins="http://localhost:5174")
@RequestMapping("/api/users")
public class UserController {
	  @Autowired
	  private UserService userService;
	  @PostMapping("/register")
      public String registerUser(@RequestBody User user) {
    	  String email = user.getEmail();
    	  String password = user.getPassword();
    	  String name = user.getName();
    	  return userService.registerUser(name, email, password);
      }
}
