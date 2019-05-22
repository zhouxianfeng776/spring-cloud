package com.zhou.test;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.turbine.EnableTurbine;

/**
 * @author 01384526
 * @title: TurbineApplication
 * @projectName spring-cloud
 * @description: TODO
 * @date 2019/5/2117:40
 */
@EnableTurbine
@SpringBootApplication
public class TurbineApplication {
    public static void main(String[] args) {
        new SpringApplicationBuilder(TurbineApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
