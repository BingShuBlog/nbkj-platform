package com.nbkj.member.service.impl;

import com.nbkj.entity.AppEntity;
import com.nbkj.member.feign.WeiXinServiceFeign;
import com.nbkj.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

/**
 * @version V1.0
 * @description:会员服务实现类
 * @author: BingShu
 * @contact: wx:hsj179540
 * @date: 2019年-07月-21日-20
 */
@RestController
public class MemberServiceImpl implements MemberService {

    @Autowired
    private WeiXinServiceFeign weiXinServiceFeign;

    @Override
    public AppEntity memberToWeiXin() {
       return weiXinServiceFeign.getApp();
    }
}
