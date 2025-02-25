package com.hackathon.hackathonPrep.security;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class JwtValidation {
    @Value("${jwt.secret}")
	private  String jwtSecrete;
    
    
}
