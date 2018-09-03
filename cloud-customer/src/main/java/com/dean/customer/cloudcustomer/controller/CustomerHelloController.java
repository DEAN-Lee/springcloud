package com.dean.customer.cloudcustomer.controller;

import com.dean.customer.cloudcustomer.server.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author LiMeng
 * @version 1.0
 * @date 2018-08-31 17:40
 */
@RestController
public class CustomerHelloController {
    @Autowired
    HelloRemote helloRemote;

    @GetMapping
    public String helloWord() {
        return helloRemote.hello("test");
    }
}
