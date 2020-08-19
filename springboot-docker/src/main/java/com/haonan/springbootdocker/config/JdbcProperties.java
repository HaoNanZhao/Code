package com.haonan.springbootdocker.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author: 信息部 HN ZHAO
 * @Package:
 * @Description:属性类
 * @Date: 2020/8/19 16:39
 */

@Data
@ConfigurationProperties(prefix = "jdbc")//声明读取springboot的配置文件，前缀为jdbc的
public class JdbcProperties {
    private String url;
    private String driverClassName;
    private String username;
    private String password;
}
