package com.eraser.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @CLASSDESCRIPER:
 * @AUTHOR:yirunzheng
 * @EMAIL:yrz_77@163.com
 * @DATE:2021\5\26 0026
 */
@SpringBootApplication
@MapperScan("com.eraser.server.mapper")
public class OnlineOfficeApplication {
    public static void main(String[] args) {
        SpringApplication.run(OnlineOfficeApplication.class,args);
    }
}
