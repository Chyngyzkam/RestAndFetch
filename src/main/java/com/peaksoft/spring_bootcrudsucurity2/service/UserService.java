package com.peaksoft.spring_bootcrudsucurity2.service;


import com.peaksoft.spring_bootcrudsucurity2.entity.User;

import java.util.List;

public interface UserService {

    List<User> getAllUsers();

    User getById(Long id);

    User addUser(User user);

    User updateUser(User user);

    void deleteUser(User user);

    void deleteById(Long id);



    User findByUsername(String s);
}



