package com.zp.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Created by 知否 on 2019/6/4.
 */
@Configuration//标记这是一个配置
public class SwaggerConfig {

    public ApiInfo createA(){
        ApiInfo build = new ApiInfoBuilder().title("招聘app数据接口").
                description("实现一个招聘项目的数据接口信息").build();
        return build;

    }
    @Bean//创建对象  修饰方法 方法的返回值必须是引用类型  对象存储在IOC容器
    public Docket createDocket(){
        return new Docket(DocumentationType.SWAGGER_2).apiInfo(createA()).select().
                apis(RequestHandlerSelectors.basePackage("com.zp.controller")).build();
    }
}
