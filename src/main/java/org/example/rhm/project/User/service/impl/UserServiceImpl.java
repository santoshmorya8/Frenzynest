package org.example.rhm.project.User.service.impl;

import org.example.rhm.project.User.model.User;
import org.example.rhm.project.User.repository.UserRepository;
import org.example.rhm.project.User.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public String createUser(User user) {
        userRepository.save(user);
        return "Success";
    }

    @Override
    public String updateUser(User user) {
        userRepository.save(user);
        return "Success";
    }

    @Override
    public String deleteUser(String userId) {
        userRepository.deleteById(userId);
        return "Success";
    }

    public User getUser(String userId) {
        return userRepository.findById(userId).get();
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

//



}