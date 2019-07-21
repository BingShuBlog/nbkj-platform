package com.nbkj;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 *
 *
 * @description: eurekaa注册中心
 * @author: BingShu
 * @contact: wx:hsj179540
 * @date: 2019年7月21日19:16:35
 * @version V1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class AppEureka {

    public static void main(String[] args) {
        SpringApplication.run(AppEureka.class, args);
    }
}
