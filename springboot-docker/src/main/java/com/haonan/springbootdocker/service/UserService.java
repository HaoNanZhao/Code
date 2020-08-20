package com.haonan.springbootdocker.service;

import com.haonan.springbootdocker.mapper.UserMapper;
import com.haonan.springbootdocker.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author: 信息部 HN ZHAO
 * @Package:
 * @Description:
 * @Date: 2020/8/20 10:13
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public User selectUserById(Long id){
        return userMapper.selectUserById(id);
    }
}
