package com.zp.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 *@Author feri
 *@Date Created in 2019/6/3 14:45
 * Swagger设置
 */
@Configuration //标记这是一个配置
@EnableSwagger2
public class SwaggerConfig {

    public ApiInfo createA(){
        ApiInfo info=new ApiInfoBuilder().title("招聘wap找职位接口").
                description("实现一个查询所有职位信息的数据接口").build();
        return info;
    }
    @Bean//创建对象  修饰方法 方法的返回值必须是引用类型  对象存储在IOC容器
    public Docket createDocket(){
       Docket docket=new Docket(DocumentationType.SWAGGER_2).apiInfo(createA()).select().
               apis(RequestHandlerSelectors.basePackage("com.zp.controller")).build();
       return docket;

    }
}
