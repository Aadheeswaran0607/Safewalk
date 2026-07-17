package com.example.safewalk.controller;

import com.example.safewalk.model.User;
import com.example.safewalk.repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;   // 🔥 ADD THIS
import org.springframework.http.HttpStatus;      // 🔥 ADD THIS

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) {
        return userRepository.save(user);
    }

    @PostMapping("/login")
    public ResponseEntity<?> loginUser(@RequestBody User user) {

        System.out.println("EMAIL: " + user.getEmail());
        System.out.println("PASSWORD: " + user.getPassword());

        User existingUser = userRepository
                .findByEmailAndPassword(user.getEmail(), user.getPassword());

        if (existingUser != null) {
            return ResponseEntity.ok(existingUser);
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                    .body("Invalid email or password");
        }
    }
}