package com.example.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@Slf4j
@SpringBootApplication(exclude={org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration.class})
public class TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
        log.info("项目启动成功。。。");
    }

}
