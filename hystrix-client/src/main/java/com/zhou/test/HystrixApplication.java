package com.zhou.test;

import com.zhou.test.componet.StoreIntegration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 01384526
 * @title: HystrixApplication
 * @projectName spring-cloud
 * @description: TODO
 * @date 2019/5/2117:08
 */
@SpringBootApplication
@EnableCircuitBreaker
@RestController
public class HystrixApplication {

    @Autowired
    StoreIntegration storeIntegration;

    @RequestMapping("/")
    public String home() {
        return storeIntegration.getStores(null);
    }

        public static void main(String[] args) {
            new SpringApplicationBuilder(HystrixApplication.class).web(WebApplicationType.SERVLET).run(args);
        }
}
