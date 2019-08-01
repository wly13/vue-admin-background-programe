package com.example.vue.controller;

import com.example.vue.service.ListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController //控制器注解 表示所有数据都以json格式返回
@CrossOrigin  //跨域注解
public class ListController {
    @Autowired //自动导入某个bean/domain
    private ListService listService;

    @RequestMapping("api/list") //路由注解

    public List<com.example.vue.domain.List> list() {
        return listService.queryAll();
    }

    @RequestMapping(value = "api/name", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public List<com.example.vue.domain.List> name( @RequestBody Map<String, String> data ) {
        String name = data.get("name");
        if (!name.equals("")) {
            return listService.queryByName(name);
        } else {
            return listService.queryAll();
        }

    }

    @RequestMapping(value = "api/addList", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public int  addList( @RequestBody Map<String, String> data ) {
        com.example.vue.domain.List list = new com.example.vue.domain.List();
        String name = data.get("name");
        String sex = Integer.parseInt(data.get("sex")) == 0 ? "女" : "男";
        String age = data.get("age");
        String birthday = data.get("birth");
        String address = data.get("address");
        list.setName(name);
        list.setSex(sex);
        list.setAge(Integer.parseInt(age));
        list.setBirthday(birthday);
        list.setAddress(address);
        return listService.addList(list);
    }

    @RequestMapping(value = "api/delList",method = RequestMethod.POST,produces = "application/json;charset=UTF-8")

    public int delList(@RequestBody Map<String,String> data){
        int id = Integer.parseInt(data.get("id"));
        System.out.println(id);
        int num = listService.delList(id);
        System.out.println(num);
        return num;
    }
//    @RequestMapping(value = "api/findAge",method = RequestMethod.POST,produces = "json/application;charset=UTF-8")

//    public com.example.vue.domain.List findAge    (){
//
//    }
}
