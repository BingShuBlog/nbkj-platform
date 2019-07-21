package com.nbkj.member.feign;

import com.nbkj.weixin.service.WeiXinService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @version V1.0
 * @description:会员服务调用微信服务
 * @author: BingShu
 * @contact: wx:hsj179540
 * @date: 2019年-07月-21日-20
 */
@FeignClient("app-nbkj-weixin")
public interface WeiXinServiceFeign extends WeiXinService {
}
