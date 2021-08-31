package com.mengxuegu.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HelloMainApplication {
    public static void main(String[] args) {
        String b="world";
        SpringApplication.run(HelloMainApplication.class,args);
    }
}
