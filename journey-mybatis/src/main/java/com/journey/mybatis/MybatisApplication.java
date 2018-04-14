package com.journey.mybatis;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by chen on 2018/4/10.
 */

@Slf4j
@MapperScan("com.journey.mybatis.dao")
@SpringBootApplication
public class MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class,args);
        log.info("MybatisApplication启动成功");
    }
}
