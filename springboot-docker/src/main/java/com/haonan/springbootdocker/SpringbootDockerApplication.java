package com.haonan.springbootdocker;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("mapper")
public class SpringbootDockerApplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringbootDockerApplication.class, args);
    }

}

