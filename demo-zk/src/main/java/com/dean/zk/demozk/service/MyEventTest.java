package com.dean.zk.demozk.service;

import org.springframework.context.ApplicationEvent;

/**
 * @author LiMeng
 * @version 1.0
 * @date 2018-10-26 17:47
 */
public class MyEventTest extends ApplicationEvent {

    public MyEventTest(Object source) {
        super(source);
    }

}
