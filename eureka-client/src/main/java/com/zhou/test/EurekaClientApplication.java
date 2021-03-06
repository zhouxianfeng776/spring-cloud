package com.zhou.test;

import org.springframework.beans.factory.annotation.Value;
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

    @Value("${isException:false}")
    private boolean isException;

    @Value("${test}")
    private String test;

    @RequestMapping("/")
    public String home() {
        if (isException){
            throw new RuntimeException("出现异常了。");
        }
        return test;
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(EurekaClientApplication.class).web(WebApplicationType.SERVLET).run(args);
    }

}