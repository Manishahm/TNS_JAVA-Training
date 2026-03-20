package com.smms.smmsuser.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity; // <-- needed for ResponseEntity
import org.springframework.web.bind.annotation.*;

import com.smms.smmsuser.entity.User;
import com.smms.smmsuser.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    // ===== CRUD Operations =====
    @PostMapping // add new user
    public ResponseEntity<User> addUser(@RequestBody User user) {
        return ResponseEntity.ok(userService.addUser(user));
    }

    @GetMapping("/{id}") // get user by id
    public ResponseEntity<User> getUser(@PathVariable int id) {
        User user = userService.getUserById(id);
        return (user != null) ? ResponseEntity.ok(user) : ResponseEntity.notFound().build();
    }

    @PutMapping("/{id}") // update user
    public ResponseEntity<User> updateUser(@PathVariable int id, @RequestBody User user) {
        User updatedUser = userService.updateUser(id, user);
        return (updatedUser != null) ? ResponseEntity.ok(updatedUser) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}") // delete user
    public ResponseEntity<Void> deleteUser(@PathVariable int id) {
        userService.deleteUser(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping // get all users
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(userService.getAllUsers());
    }

    // ===== LOGIN =====
    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody User loginRequest) {
        User user = userService.login(loginRequest.getName(), loginRequest.getPassword());
        if (user != null) {
            return ResponseEntity.ok(user);
        } else {
            return ResponseEntity.status(401).build(); // Unauthorized
        }
    }

    // ===== LOGOUT =====
    @PostMapping("/logout")
    public ResponseEntity<String> logout(@RequestParam int userId) {
        boolean result = userService.logOut(userId);
        if (result) {
            return ResponseEntity.ok("User logged out successfully");
        } else {
            return ResponseEntity.status(404).body("User not found");
        }
    }
}