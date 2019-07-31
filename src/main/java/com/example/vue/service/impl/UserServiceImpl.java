package com.example.vue.service.impl;

import com.example.vue.dao.UserDao;
import com.example.vue.domain.User;
import com.example.vue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("UserService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User findByName(String name){
        return userDao.findName(name);
    }
    public User Login(String name,String password){
        return userDao.Login(name,password);
    }
}
