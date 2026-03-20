package com.smms.smmsuser.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smms.smmsuser.entity.User;
import com.smms.smmsuser.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User addUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(int id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public User updateUser(int id, User user) {
        User existingUser = userRepository.findById(id).orElse(null);

        if (existingUser != null) {
            existingUser.setName(user.getName());
            existingUser.setType(user.getType());
            existingUser.setPassword(user.getPassword());
            return userRepository.save(existingUser);
        }

        return null;
    }

    @Override
    public void deleteUser(int id) {
        userRepository.deleteById(id);
    }

    // ===== LOGIN & LOGOUT =====
    @Override
    public User login(String username, String password) {
        // Find user by name
        User user = userRepository.findByName(username);

        if (user != null && user.getPassword().equals(password)) {
            // You can add a 'loggedIn' flag if needed
            return user;
        }
        return null;
    }

    @Override
    public boolean logOut(int userId) {
        // If you have a session flag, set it to false
        User user = userRepository.findById(userId).orElse(null);
        if (user != null) {
            // Example: user.setLoggedIn(false);
            // userRepository.save(user);
            return true;
        }
        return false;
    }
}