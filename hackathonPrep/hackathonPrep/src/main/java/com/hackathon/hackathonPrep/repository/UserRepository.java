package com.hackathon.hackathonPrep.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.hackathon.hackathonPrep.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
      public Optional<User> findByEmail(String email);
}
