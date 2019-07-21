package com.nbkj.weixin.service;

import com.nbkj.entity.AppEntity;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @version V1.0
 * @description:微信公共接口
 * @author: BingShu
 * @contact: wx:hsj179540
 * @date: 2019年-07月-21日-19
 */
public interface WeiXinService {

    /**
     * 获取应用接口
     * @return
     */
    @GetMapping("/getApp")
    AppEntity getApp();
}
