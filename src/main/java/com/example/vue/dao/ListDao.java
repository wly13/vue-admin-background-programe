package com.example.vue.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface ListDao {
    List<com.example.vue.domain.List> findAll();
    List<com.example.vue.domain.List> queryName( @Param ("name") String name);
    int insertList( com.example.vue.domain.List list );
    int deleteList(@Param("id") int id);
    List<com.example.vue.domain.List> pagingQuery(@Param("start")int start,@Param("pageSize") int pageSize);
}
