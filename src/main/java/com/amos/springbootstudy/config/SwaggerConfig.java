package com.amos.springbootstudy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
//@EnableSwagger2
public class SwaggerConfig {

/*
    *//**
     * 初始化swagger 扫描路径，接口等
     *//*
    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()

                //扫描路径地址
                .apis(RequestHandlerSelectors.basePackage("com.amos.springbootstudy"))
                //那些接口需要被生成
                .paths(PathSelectors.regex("/test/.*"))
                .build();
    }


    *//**
     * api  相关详细信息
     * @return
     *//*
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("boot lannch 项目 API 文档")
                .description("利用swagger来生成文档")
                .termsOfServiceUrl("")
                .version("1.0")
                .build();
    }*/
}
