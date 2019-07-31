package com.example.vue.dao;

import com.example.vue.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * dao相当于mapper
 * 数据操作层
 * interface
 */
@Mapper
@Repository
public interface UserDao {
    User findName(@Param("name") String name);
    User Login(@Param("name") String name,@Param("password") String password);
}
