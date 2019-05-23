package com.zhou.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 01384526
 * @title: ConfigClentApplication
 * @projectName spring-cloud
 * @description: TODO
 * @date 2019/5/2316:34
 */
@SpringBootApplication
@RestController
public class ConfigClentApplication {

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

    public static void main(String[] args) {
        SpringApplication.run(ConfigClentApplication.class, args);
    }

}