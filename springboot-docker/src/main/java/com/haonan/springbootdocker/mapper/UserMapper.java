package com.haonan.springbootdocker.mapper;

import com.haonan.springbootdocker.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @Author: 信息部 HN ZHAO
 * @Package:
 * @Description:
 * @Date: 2020/8/20 9:50
 */
@Mapper
@Repository
public interface UserMapper {
    User selectUserById(@Param("id")Long id);
}
