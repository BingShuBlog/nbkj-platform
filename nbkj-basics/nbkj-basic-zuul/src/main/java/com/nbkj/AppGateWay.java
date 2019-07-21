package com.nbkj;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @version V1.0
 * @description:Api网关
 * @author: BingShu
 * @contact: wx:hsj179540
 * @date: 2019年-07月-22日-00
 */
@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
@EnableSwagger2Doc
public class AppGateWay {
    public static void main(String[] args) {
        SpringApplication.run(AppGateWay.class,args);
    }
}
