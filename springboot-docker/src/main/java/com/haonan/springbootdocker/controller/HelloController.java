package com.haonan.springbootdocker.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 信息部 HN ZHAO
 * @Package:
 * @Description:
 * @Date: 2020/8/19 14:28
 */
@RestController
public class HelloController {
    @GetMapping("hello")
    public String sayHello(){
        return "你好！";
    }
}
