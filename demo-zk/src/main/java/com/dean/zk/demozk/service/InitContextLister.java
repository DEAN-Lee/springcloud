package com.dean.zk.demozk.service;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

/**
 * @author LiMeng
 * @version 1.0
 * @date 2018-10-26 18:24
 */
@Component
public class InitContextLister implements ApplicationListener<ContextRefreshedEvent> {
    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("########################event = [" + event.getTimestamp() + "]");
    }
}
