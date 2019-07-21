package com.nbkj.entity;

import lombok.Builder;
import lombok.Data;

/**
 * @version V1.0
 * @description: 微信参数
 * @author: BingShu
 * @contact: wx:hsj179540
 * @date: 2019年-07月-21日-19
 */
@Data
@Builder
public class AppEntity {
    /**
     * appId
     */
    private String appId;
    /**
     * appName
     */
    private String appName;
}
