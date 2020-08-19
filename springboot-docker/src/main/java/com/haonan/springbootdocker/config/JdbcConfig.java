package com.haonan.springbootdocker.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.activation.DataSource;

/**
 * @Author: 信息部 HN ZHAO
 * @Package:
 * @Description: Jdbc的配置类
 * @Date: 2020/8/19 16:53
 */
@Configuration
@EnableConfigurationProperties(JdbcProperties.class)//声明激活属性类
public class JdbcConfig {

    @Bean
    public DataSource dataSource(JdbcProperties jdbc){//将装配好的jdbc作为参数
        DruidDataSource dataSource =new DruidDataSource();
        dataSource.setUrl(jdbc.getUrl());
        dataSource.setDriverClassName(jdbc.getDriverClassName());

        return (DataSource) dataSource;
    }
}
