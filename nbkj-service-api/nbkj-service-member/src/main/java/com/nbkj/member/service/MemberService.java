package com.nbkj.member.service;

import com.nbkj.entity.AppEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @version V1.0
 * @description:会员服务接口
 * @author: BingShu
 * @contact: wx:hsj179540
 * @date: 2019年-07月-21日-20
 */
@Api("会员服务接口")
public interface MemberService {

    /**
     * 会员调用微信
     *
     * @return
     */
    @ApiOperation("会员服务调用微信服务接口")
    @GetMapping("/memberToWeiXin")
    AppEntity memberToWeiXin();
}
