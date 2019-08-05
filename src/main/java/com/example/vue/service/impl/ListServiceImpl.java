package com.example.vue.service.impl;

import com.example.vue.dao.ListDao;
import com.example.vue.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("ListService")
public class ListServiceImpl implements ListService {
    @Autowired

    private ListDao listDao;

    public List<com.example.vue.domain.List> queryAll(){
        return listDao.findAll();
    }

    public List<com.example.vue.domain.List> queryByName( String name){
        return listDao.queryName(name);
    }
    public int addList( com.example.vue.domain.List list ){
        return listDao.insertList(list);
    }
    public int delList(int id){
        return listDao.deleteList(id);
    }
    public List<com.example.vue.domain.List> pagingQuery(int start,int pageSize){
        return listDao.pagingQuery(start,pageSize);
    }

}
