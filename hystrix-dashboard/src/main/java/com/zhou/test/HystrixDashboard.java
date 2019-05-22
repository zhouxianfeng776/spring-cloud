package com.zhou.test;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * @author 01384526
 * @title: HystrixDashboard
 * @projectName spring-cloud
 * @description: TODO
 * @date 2019/5/2117:22
 */
@SpringBootApplication
@EnableHystrixDashboard
public class HystrixDashboard {
    public static void main(String[] args) {
        new SpringApplicationBuilder(HystrixDashboard.class).web(WebApplicationType.SERVLET).run(args);
    }
}
