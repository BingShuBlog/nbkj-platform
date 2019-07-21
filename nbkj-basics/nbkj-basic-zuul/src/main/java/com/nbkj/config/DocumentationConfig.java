package com.nbkj.config;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;

/**
 * @version V1.0
 * @description:网关配置文件
 * @author: BingShu
 * @contact: wx:hsj179540
 * @date: 2019年-07月-22日-00
 */
@Component
@Primary
public class DocumentationConfig implements SwaggerResourcesProvider {
    @Override
    public List<SwaggerResource> get() {
        List resources = new ArrayList<>();
        // 使用别名获取SwaggerApi接口
        resources.add(swaggerResource("app-nbkj-member", "/app-nbkj-member/v2/api-docs", "2.0"));
        resources.add(swaggerResource("app-nbkj-weixin", "/app-nbkj-weixin/v2/api-docs", "2.0"));
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location, String version) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion(version);
        return swaggerResource;
    }
}
