package com.crc.back.project;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.crc.back.project.mapper")
public class BackProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(BackProjectApplication.class, args);
    }

}
