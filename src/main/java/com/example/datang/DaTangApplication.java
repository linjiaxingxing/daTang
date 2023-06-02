package com.example.datang;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.datang.demos.mapper")
public class DaTangApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaTangApplication.class, args);
    }

}
