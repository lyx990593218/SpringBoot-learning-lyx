package com.lyx.mybatispagehelper;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.lyx.mybatispagehelper.mapper")
@SpringBootApplication
public class MybatisPagehelperApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisPagehelperApplication.class, args);
    }
}
