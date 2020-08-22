package controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: 信息部 HN ZHAO
 * @Package:
 * @Description:
 * @Date: 2020/8/22 15:30
 */
@RestController
public class HelloController {
    @GetMapping("hello")
    public String hello(){
        return "Hello World！";
    }
}
