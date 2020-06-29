package com.aha.smallmall;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.aha.smallmall.mapper")
public class SmallmallApplication {

    public static void main(String[] args) {
        SpringApplication.run(SmallmallApplication.class, args);
    }

}
