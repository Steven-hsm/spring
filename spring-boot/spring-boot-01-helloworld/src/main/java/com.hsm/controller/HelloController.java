package com.hsm.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: steven
 * @date: 2019/11/25
 * @description hello world
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    @ResponseBody
    public String index(){
        return "hello world!";
    }
}
