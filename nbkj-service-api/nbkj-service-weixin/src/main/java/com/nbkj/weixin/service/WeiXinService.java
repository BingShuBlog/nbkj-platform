package com.nbkj.weixin.service;

import com.nbkj.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @version V1.0
 * @description:微信公共接口
 * @author: BingShu
 * @contact: wx:hsj179540
 * @date: 2019年-07月-21日-19
 */
@Api("微信服务接口")
public interface WeiXinService {

    /**
     * 获取应用接口
     * @return
     */
    @ApiOperation("微信服务获取App")
    @GetMapping("/getApp")
    AppEntity getApp();
}
