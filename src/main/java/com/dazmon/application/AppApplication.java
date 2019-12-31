package com.dazmon.application;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AppApplication {


    public static void main(String[] args) {
        SpringApplication.run(AppApplication.class, args);
    }

}
