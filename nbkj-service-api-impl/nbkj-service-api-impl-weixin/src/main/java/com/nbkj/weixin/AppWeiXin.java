package com.nbkj.weixin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @version V1.0
 * @description:微信服务项目
 * @author: BingShu
 * @contact: wx:hsj179540
 * @date: 2019年-07月-21日-20
 */
@SpringBootApplication
@EnableEurekaClient
public class AppWeiXin {
    public static void main(String[] args) {
        SpringApplication.run(AppWeiXin.class,args);
    }
}
