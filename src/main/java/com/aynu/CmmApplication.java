package com.aynu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.aynu")
@SpringBootApplication
public class CmmApplication {

    public static void main(String[] args) {
        SpringApplication.run(CmmApplication.class, args);
    }

}
