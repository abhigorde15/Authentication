package com.hackathon.hackathonPrep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.hackathon.hackathonPrep.model.User;
import com.hackathon.hackathonPrep.repository.UserRepository;

@Service
public class UserService {
	@Autowired
    private UserRepository repository;
    
    private final BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
    
    public String registerUser(String name,String email,String password) {
    	if(repository.findByEmail(email).isPresent()) {
    		return "Email is Already Present";
    	}
    	User user = new User();
    	user.setEmail(email);
    	user.setName(name);
    	user.setPassword(passwordEncoder.encode(password));
    	repository.save(user);
    	return "Successfully Saved User";
    }
}
