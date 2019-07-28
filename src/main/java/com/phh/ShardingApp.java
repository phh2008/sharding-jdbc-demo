package com.phh;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 启动入口
 *
 * @author phh
 * @version V1.0
 * @date 2019/5/16
 */
@MapperScan(basePackages = "com.phh.repo")
@SpringBootApplication
public class ShardingApp {

    public static void main(String[] args) {
        SpringApplication.run(ShardingApp.class, args);
    }

}
