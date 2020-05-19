package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
//ComponentScan  可以扫描不在启动类所在包下面的其他Bean，本例中的HelloWorldNew
@ComponentScan(basePackages={"com.example.controller","com.example.demo.controller"})
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }



}
