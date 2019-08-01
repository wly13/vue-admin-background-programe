package com.example.vue.controller;

import com.example.vue.domain.User;
import com.example.vue.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping(value = "api/user", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
//    @RequestMapping("api/user")
//    public User user(){
//    public User user( @RequestBody Map<String,String> data ) {
//        return userService.findByName("dasd");
////        return userService.findByName(data.get("name"));
//    }
    public Map<String,User> user(@RequestBody Map<String,String> data){
        User user;
        String name = data.get("name");
        user = userService.findByName(name);
        Map<String,User> map = new HashMap<>();
        map.put("user",user);
        return map;
    }

    @RequestMapping(value = "api/login", method = RequestMethod.POST,produces = "application/json;charset=UTF-8")
    public User Login( @RequestBody Map<String,String> data) {
//        User user;
        String name = data.get("username");
        String password = data.get("password");
//        System.out.println(name);
//        System.out.println(password);
//        user =userService.findByName(name);
//        Map<String, String> map = new HashMap<>();
//        if (user == null){
//            map.put("msg","用户不存在，请重新输入");
//            return map;
//
//        }
//        else {
//            String user1 = userService.Login(name,password).toString();
//            System.out.println(user1);
//            map.put("user",user1);
//            System.out.println(map);
//            return map;
//        }
        return userService.Login(name,password);
    }
}
