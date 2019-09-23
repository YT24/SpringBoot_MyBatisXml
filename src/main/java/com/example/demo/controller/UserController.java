package com.example.demo.controller;

import com.example.demo.mapper.UserMapper;
import com.example.demo.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Map;

@RestController
public class UserController {
    @Autowired
    private UserMapper userMapper;


    @PostMapping("register")
    public String register(@RequestBody User user, HttpServletResponse response, HttpServletRequest request){

        userMapper.insert(user);

        return "success";
    }

    @PostMapping("update")
    public String update(@RequestBody User user, HttpServletResponse response, HttpServletRequest request){

        userMapper.updateById(user);

        return "success";
    }

}
