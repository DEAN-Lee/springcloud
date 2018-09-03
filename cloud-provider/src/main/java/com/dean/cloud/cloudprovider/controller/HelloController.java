package com.dean.cloud.cloudprovider.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiMeng
 * @version 1.0
 * @date 2018-08-31 17:15
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " + name + "，this is first messge";
    }
}
