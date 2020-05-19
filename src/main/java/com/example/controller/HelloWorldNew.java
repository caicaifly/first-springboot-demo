package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 文件描述
 *
 * @ProductName: Hundsun HEP
 * @ProjectName: first-springboot-demo
 * @Package: com.example.controller
 * @Description: note
 * @Author: xiangdc16781
 * @CreateDate: 2020-05-19 13:23
 * @UpdateUser: xiangdc16781
 * @UpdateDate: 2020-05-19 13:23
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * <p>
 * Copyright © 2020 Hundsun Technologies Inc. All Rights Reserved
 **/
@RestController
public class HelloWorldNew {
    @RequestMapping("/hello")
    public String hello(){
        return "hello，world!";

    }
}
