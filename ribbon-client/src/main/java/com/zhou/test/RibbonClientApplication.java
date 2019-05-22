package com.zhou.test;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @author 01384526
 * @title: RibbonClientApplication
 * @projectName spring-cloud
 * @description: TODO
 * @date 2019/5/2118:46
 */
@SpringBootApplication
public class RibbonClientApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(RibbonClientApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}

