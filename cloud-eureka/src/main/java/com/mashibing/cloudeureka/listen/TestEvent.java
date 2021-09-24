package com.mashibing.cloudeureka.listen;

import org.springframework.cloud.netflix.eureka.server.event.EurekaInstanceCanceledEvent;
import org.springframework.stereotype.Component;

@Component
public class TestEvent {
        public void listen(EurekaInstanceCanceledEvent event){
            //发短信或者邮件提醒
            System.out.println("下线："+event.getServerId());
        }
}
