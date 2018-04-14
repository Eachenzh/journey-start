package com.journey.jpa;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by chen on 2018/4/14.
 */

@Slf4j
@SpringBootApplication
public class JpaApplication {

    public static void main(String[] args) {
        SpringApplication.run(JpaApplication.class,args);

        log.info("JpaApplication启动成功");
    }

}
