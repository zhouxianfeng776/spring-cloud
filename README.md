# 0.工具介绍
    
    actuator用法
    <dependency>
      <groupId>org.springframework.cloud</groupId>
      <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
    </dependency>
    默认只有info，health端点可以使用
    service-registry端点可以下线服务，在测试中很有用。
    management:
      endpoints:
        web:
          exposure:
            include: "info,health,service-registry"

# 1.工程介绍
>   spring cloud netflix
>   >eureka-server,eureka-client 服务注册与发现<br />
>   hystrix-client 熔断器（异常时fallback)<br />
>   hystrix-dashboard 查看熔断监控的页面<br />
>   turbine 查看多个应用的熔断监控<br />
>   ribbon-client 负载均衡客户端（可以不与eureka使用）<br />
>   >zuul (路由控制和过滤--网关)
----------------
>   spring Feign   