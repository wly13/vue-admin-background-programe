package com.example.vue.domain;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * user实体类
 */
public class User {
    private Integer age;
    private String name;
    private String sex;
    private String password;

    //    下面是变量的setter和getter
    public void setAge( Integer age ) {
        this.age = age;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public void setSex( String sex ) {
        this.sex = sex;
    }

    public void setPassword( String password ) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    public String getPassword() {
        return password;
    }
    public JSONObject toJson() {
//        return "[{username:" + name + ", password:" + password
//                + ", sex:" + sex + ", age:" + age
//                + "}]";
        JSONObject object = new JSONObject();
        try {
            object.put("name",name);
            object.put("password",password);
            object.put("sex",sex);
            object.put("age",age);
            System.out.println(object);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        return object;
    }
    @Override
    public String toString(){
        return "username:" + name + ", password:" + password
                + ", sex:" + sex + ", age:" + age;
    }
}
