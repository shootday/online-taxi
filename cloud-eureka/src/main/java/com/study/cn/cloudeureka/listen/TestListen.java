package com.study.cn.cloudeureka.listen;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.stereotype.Component;

/**
 * @program: online-taxi-three
 * @Date: 2020/5/27 11:29
 * @Author: lzx
 * @Description:
 */
@Component
public class TestListen {

    public void listen(EurekaInstanceCanceledEvent eurekaInstanceCanceledEvent) {
        System.out.println("服务下线。。。。" + eurekaInstanceCanceledEvent.getServerId());

    }
}
