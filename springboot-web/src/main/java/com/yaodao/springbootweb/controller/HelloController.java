package com.yaodao.springbootweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @Author: 信息部 HN ZHAO
 * @Package:
 * @Description:
 * @Date: 2020/8/24 8:43
 */
@Controller
public class HelloController {
    @ResponseBody
    @RequestMapping("/hello")
    public String hello(){
        return "Hello World!";
    }
    //@RestController=@Controller+@ResponseBody

    //不写    @ResponseBody
    @RequestMapping("/success")
    public String success(){
        return "success";
        //return的内容必须要和对应的html名字一致  要不然会找不到：Cannot resolve MVC View 'xxx'
    }

    @RequestMapping("/test")
    public String test (Map<String , Object> map){
        map.put("message","成功获得数据！");
        return "test";

    }
}
