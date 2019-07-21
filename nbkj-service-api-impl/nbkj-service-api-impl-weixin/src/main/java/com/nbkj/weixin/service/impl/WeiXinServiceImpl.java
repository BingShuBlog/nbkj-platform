package com.nbkj.weixin.service.impl;

import com.nbkj.entity.AppEntity;
import com.nbkj.weixin.service.WeiXinService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V1.0
 * @description:微信接口实现类
 * @author: BingShu
 * @contact: wx:hsj179540
 * @date: 2019年-07月-21日-20
 */
@RestController
public class WeiXinServiceImpl implements WeiXinService {
    @Override
    public AppEntity getApp() {
        AppEntity appEntity = AppEntity.builder().appId("123456").appName("BingShu").build();
        return appEntity;
    }
}
