package com.haonan.springbootdocker;

import ch.qos.logback.classic.spi.ILoggingEvent;
import com.haonan.springbootdocker.bean.Person;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 *SpringBoot单元测试
 */
@RunWith(SpringRunner.class)
@SpringBootTest
class SpringbootDockerApplicationTests {
    /*@Autowired
    Person person;
    @Test
    void contextLoads() {
        System.out.println(person.toString());
    }*/
    @Test
    void logPrint(){
        Logger logger = LoggerFactory.getLogger(getClass());
        logger.trace("这是trace日志");
        logger.debug("这是debug日志");
        logger.info("这是info日志");
        logger.warn("这是warn日志");
        logger.error("这是error日志");
    }
}
