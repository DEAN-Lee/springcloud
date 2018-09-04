package com.dean.zk.demozk.service;

import org.I0Itec.zkclient.ZkClient;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author LiMeng
 * @version 1.0
 * @date 2018-09-04 17:52
 */
@Service
public class ZkOpService {

    public boolean createdZkNode() {
        ZkClient zkClient = new ZkClient("127.0.0.1:2181");
        zkClient.createEphemeral("/dean");
        zkClient.getChildren("dubbo");
        return true;
    }

    public List<String> getZkNode() {
        ZkClient zkClient = new ZkClient("127.0.0.1:2181");
        zkClient.delete("/dean");
        return zkClient.getChildren("/dubbo");
    }

    public boolean deleteNode() {
        ZkClient zkClient = new ZkClient("127.0.0.1:2181");
        return  zkClient.delete("/dean");
    }
}
