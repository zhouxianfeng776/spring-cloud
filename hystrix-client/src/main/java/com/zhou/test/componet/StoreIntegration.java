package com.zhou.test.componet;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @author 01384526
 * @title: StoreIntegration
 * @projectName spring-cloud
 * @description: TODO
 * @date 2019/5/2117:13
 */
@Component
public class StoreIntegration {

    /**
     * 或者设置
     * hystrix.shareSecurityContext property to true
     * @param parameters
     * @return
     */

    @HystrixCommand(fallbackMethod = "defaultStores",
            commandProperties = {
                    @HystrixProperty(name="execution.isolation.strategy", value="SEMAPHORE")
            }
    )
    public String getStores(Map<String, Object> parameters) {
        return "success";
    }

    private String defaultStores(Map<String, Object> parameters) {
        return "fail";
    }
}
