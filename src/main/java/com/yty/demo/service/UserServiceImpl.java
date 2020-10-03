package com.yty.demo.service;

import com.yty.demo.dao.UserRepository;
import com.yty.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<User> getALLUser() {
        return userRepository.findAll();
    }
}
