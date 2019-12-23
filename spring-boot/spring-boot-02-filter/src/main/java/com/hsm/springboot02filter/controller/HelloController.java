package com.hsm.springboot02filter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Auther: huangsenming
 * @Date: 2019/12/23 18:09
 * @Description:
 */
@RestController
public class HelloController {
    @RequestMapping("/")
    public String index(){
        return "hello world";
    }
}
