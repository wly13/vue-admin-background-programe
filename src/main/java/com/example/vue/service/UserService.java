package com.example.vue.service;

import com.example.vue.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * service层
 */
@Service
public interface UserService {
    @Autowired
    User findByName(String name);
    User Login(String name,String password);
}
