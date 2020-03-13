package com.renwu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync //开启异步注解
@EnableScheduling //开启定时任务的注解
@SpringBootApplication
public class RenwuApplication {

    public static void main(String[] args) {
        SpringApplication.run(RenwuApplication.class, args);
    }

}
