package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文件描述
 *
 * @ProductName: Hundsun HEP
 * @ProjectName: first-springboot-demo
 * @Package: com.example.demo.controller
 * @Description: note
 * @Author: xiangdc16781
 * @CreateDate: 2020-05-19 12:35
 * @UpdateUser: xiangdc16781
 * @UpdateDate: 2020-05-19 12:35
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright © 2020 Hundsun Technologies Inc. All Rights Reserved
 **/
@RestController
public class HelloController {

    //可以直接配置文件中的常量
    @Value("${controller.hello}")
    private String hello;

    @RequestMapping("/sayHello")
    public String sayHello(String say){
        return null==say ? "hello" : say;
    }

    @RequestMapping("/say")
    public String say(){
        return hello;
    }
}
