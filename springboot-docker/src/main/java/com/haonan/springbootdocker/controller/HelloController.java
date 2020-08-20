package com.haonan.springbootdocker.controller;

import com.haonan.springbootdocker.mapper.UserMapper;
import com.haonan.springbootdocker.pojo.User;
import com.haonan.springbootdocker.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;

/**
 * @Author: 信息部 HN ZHAO
 * @Package:
 * @Description:
 * @Date: 2020/8/19 14:28
 */
@RestController
public class HelloController {
    @Autowired
    private UserService userService;


    @GetMapping("hello")
    public String sayHello(){
        return "你好！";
    }
    @GetMapping("user/{id}")
    public User queryUserById(@PathVariable("id") Long id){
        return  this.userService.selectUserById(id);
    }
}
