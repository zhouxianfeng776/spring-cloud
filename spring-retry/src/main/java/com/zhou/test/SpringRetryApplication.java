package com.zhou.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.retry.annotation.Retryable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author 01384526
 * @title: SpringRetryApplication
 * @projectName spring-cloud
 * @description: TODO
 * @date 2019/5/2219:25
 */
@SpringBootApplication
@RestController
public class SpringRetryApplication {

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/")
    public String home() {
        String results = restTemplate.getForObject("http://eureka-client/", String.class);
        return results;
    }

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringRetryApplication.class).web(WebApplicationType.SERVLET).run(args);
    }
}
