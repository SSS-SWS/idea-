package com.mengxuegu.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

   @RequestMapping("/hello")
   @ResponseBody
    public String hello() {
       System.out.println("创建dev。。");
       System.out.println("分支添加");
        return "hello world..";
    }
}
