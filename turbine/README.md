
# 1测试的url

    1.调单个服务的监控
    http://localhost:8010/actuator/hystrix.stream
    2.在turbine中查看集群
    http://localhost:8085/clusters
    http://localhost:8085/turbine.stream?cluster=SYSTEM
    
    3.在hystrix dashboard中推入
    http://localhost:8082/hystrix
    


# 2从所有分布式Hystrix命令中提取度量标准的经典Turbine模型不起作用。在这种情况下，您可能希望让Hystrix命令将指标推送到Turbine。
    
    此时可以使用 Turbine Stream
    https://cloud.spring.io/spring-cloud-static/spring-cloud-netflix/2.1.0.RELEASE/single/spring-cloud-netflix.html#_service_discovery_eureka_clients
    
# 3分不同集群监控

# 4普通的是去拿监控数据，turbine stream 则是推送的

    https://cloud.spring.io/spring-cloud-static/spring-cloud-netflix/2.1.0.RELEASE/single/spring-cloud-netflix.html#_external_configuration_archaius