package com.mikrelin.springbootbackend.service;

import com.mikrelin.springbootbackend.dao.UserRepository;
import com.mikrelin.springbootbackend.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public User findByUserId(long userId) {
        return userRepository.findById(userId)
                .orElse(null);      // make sure to update not found logic
    }

    @Override
    public User findByUsername(String username) {
        return userRepository.findByUsername(username)
                .orElse(null);      // make sure to update not found logic
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    @Override
    public void deleteByUserId(long userId) {
        userRepository.deleteById(userId);
    }
}
