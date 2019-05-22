package com.zhou.test;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 01384526
 * @title: EurekaClientApplication
 * @projectName spring-cloud
 * @description: TODO
 * @date 2019/5/2116:47
 */
@SpringBootApplication
@RestController
public class EurekaClientApplication {

    @RequestMapping("/")
    public String home() {
        return "Hello world";
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaClientApplication.class).web(WebApplicationType.SERVLET).run(args);
    }

}