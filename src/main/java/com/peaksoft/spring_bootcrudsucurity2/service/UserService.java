package com.peaksoft.spring_bootcrudsucurity2.service;


import com.peaksoft.spring_bootcrudsucurity2.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getById(Long id);

    void addUser(User user);

    void updateUser(User user);

    void deleteUser(User user);



    User findByUsername(String s);
}



