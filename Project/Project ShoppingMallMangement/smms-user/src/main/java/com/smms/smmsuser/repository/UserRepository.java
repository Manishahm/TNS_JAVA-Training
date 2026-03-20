package com.smms.smmsuser.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.smms.smmsuser.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    // Add this method for login
    User findByName(String name);
}