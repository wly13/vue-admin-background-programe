package com.example.vue.domain;

import java.util.Date;

public class List {
    private int id;
    private String name;
    private String sex;
    private int age;
    private String birthday;
    private String address;

//    setter

    public void setId( int id ) {
        this.id = id;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public void setSex( String sex ) {
        this.sex = sex;
    }

    public void setAge( int age ) {
        this.age = age;
    }

    public void setBirthday( String birthday ) {
        this.birthday = birthday;
    }

    public void setAddress( String address ) {
        this.address = address;
    }
//    getter

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public int getAge() {
        return age;
    }

    public String getBirthday() {
        return birthday;
    }

    public String getAddress() {
        return address;
    }
}
