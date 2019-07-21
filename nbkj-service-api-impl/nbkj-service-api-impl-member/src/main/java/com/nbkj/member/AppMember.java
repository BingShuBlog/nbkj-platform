package com.nbkj.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @version V1.0
 * @description:会员服务启动类
 * @author: BingShu
 * @contact: wx:hsj179540
 * @date: 2019年-07月-21日-20
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class AppMember {
    public static void main(String[] args) {
        SpringApplication.run(AppMember.class,args);
    }
}
