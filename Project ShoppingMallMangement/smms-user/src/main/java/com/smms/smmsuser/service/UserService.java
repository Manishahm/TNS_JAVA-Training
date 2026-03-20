package com.smms.smmsuser.service;

import java.util.List;
import com.smms.smmsuser.entity.User;

public interface UserService {

    User addUser(User user);
    
    User getUserById(int id);

    User updateUser(int id, User user);

    void deleteUser(int id);

    List<User> getAllUsers();
    
    User login(String username, String password);
    
    boolean logOut(int userId);
}