package com.peaksoft.spring_bootcrudsucurity2.service.impl;

import com.peaksoft.spring_bootcrudsucurity2.entity.User;
import com.peaksoft.spring_bootcrudsucurity2.repository.UserRepository;
import com.peaksoft.spring_bootcrudsucurity2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }


    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getById(Long id) {
        return userRepository.findById(id).get();
    }

    @Override
    public void addUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void updateUser(User user) {
        userRepository.save(user);
    }

    @Override
    public void deleteUser(User user) {
        userRepository.delete(user);
    }


    @Override
    public User findByUsername(String s) {
        List<User>users = getAllUsers();
        return users.stream().filter(x -> x.getName().equals(s)).findAny().orElse(null);
    }
}

