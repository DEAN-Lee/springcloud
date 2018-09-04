package com.dean.zk.demozk.controller;

import com.dean.zk.demozk.service.ZkOpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author LiMeng
 * @version 1.0
 * @date 2018-09-04 17:51
 */
@RestController
public class ZkOpController {
    @Autowired
    private ZkOpService zkOpService;

    @GetMapping("createdNode")
    public boolean createdNode() {
       return zkOpService.createdZkNode();
    }



    @GetMapping("getNodes")
    public List<String> getNodes() {
        return zkOpService.getZkNode();
    }

    @GetMapping("deleteNode")
    public boolean deleteNode() {
        return zkOpService.deleteNode();
    }

}
