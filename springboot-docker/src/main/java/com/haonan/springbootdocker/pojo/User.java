package com.haonan.springbootdocker.pojo;

import lombok.Data;

import java.util.Date;

/**
 * @Author: 信息部 HN ZHAO
 * @Package:
 * @Description:pojo
 * @Date: 2020/8/20 9:10
 */
@Data
public class User {
    private Long id;
    private String userName;//用户名
    private String password;
    private String name;//姓名
    private Integer age;
    private Integer sex;//1男 2女
    private Date update;
    private Date created;
    private Date birthday;
    private String note;//备注

}
