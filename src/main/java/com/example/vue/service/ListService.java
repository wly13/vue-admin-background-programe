package com.example.vue.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ListService {
    @Autowired
    List<com.example.vue.domain.List> queryAll();
    List<com.example.vue.domain.List> queryByName(String name);
    int addList( com.example.vue.domain.List list );
    int delList(int id);
}
