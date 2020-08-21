package com.haonan.springbootdocker.bean;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Author: 信息部 HN ZHAO
 * @Package:
 * @Description: 属性类，
 * 加上@ConfigurationProperties获取配置文件中的相应内容（绑定前缀），并使用spring-boot-configuration-processor依赖，这样会使得写配置文件的时候有提示功能
 * 只有这个组件是容器中的组件才能使用容器提供的@ConfigurationProperties功能，所以要加上@component注解,不加会爆红的
 *
 * @Date: 2020/8/21 14:44
 */
@Data
@PropertySource(value = {"classpath:person.properties"})
@Component
@ConfigurationProperties(prefix = "person")
public class Person {
    private String name;
    private Map<Integer,String> map;
    private Date birth;
    private List<Object> list;
    private Dog dog;
}
