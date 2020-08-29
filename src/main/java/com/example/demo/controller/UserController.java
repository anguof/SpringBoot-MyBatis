package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @GetMapping("/queryUserList")
    public List<User> queryUserList() {
        List<User> userList = userMapper.queryUserList();
        for (User user : userList) {
            System.out.println(user);
        }
        return userList;
    }

//    @GetMapping("/queryById")
//    public User queryById() {
//
//        User user = userMapper.queryById(3);
//        return user;
//    }

    @GetMapping("/addUser")
    public String addUser() {
        userMapper.addUser(new User(5, "阿毛", "1234"));
        return "ok";
    }

    @GetMapping("/updateUser")
    public String updateUser() {
        userMapper.updateUser(new User(5, "阿狗", "1234"));
        return "ok";
    }

    @GetMapping("/deleteUser")
    public String deleteUser() {
        userMapper.deleteUser(5);
        return "ok";
    }
}
