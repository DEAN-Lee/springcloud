package com.dean.customer.cloudcustomer.server;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author LiMeng
 * @version 1.0
 * @date 2018-08-31 17:38
 */
@FeignClient(name = "cloud-provider")
public interface HelloRemote {
    @RequestMapping(value = "/hello")
    String hello(@RequestParam(value = "name") String name);
}
