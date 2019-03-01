package com.demo.service;

import com.demo.entity.User;

import java.util.List;

public interface UserService {
    List<User> listUsers();
    void insertUser(User user);
}
