# 1.profile激活的几种方式
   
>   插件激活 profile
>>   spring-boot:run -Drun.profiles=prod

>   main 方法激活 profile
>>   --spring.profiles.active=prod

>   jar 激活 profile
>>   java -jar -Dspring.profiles.active=prod *.jar

##   在 Java 代码中激活 profile
>   直接指定环境变量来激活 profile：
>>   System.setProperty("spring.profiles.active", "test");
   
>   在 Spring 容器中激活 profile：
>>   AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
   ctx.getEnvironment().setActiveProfiles("development");
   ctx.register(SomeConfig.class, StandaloneDataConfig.class, JndiDataConfig.class);
   ctx.refresh(); 

#  2.注册中心集群配置

    显示注册ip
    eureka.instance.preferIpAddress to true 
    在idea中测试集群，增加多个运行的配置，每个配置有不同profile
    
#  3.安全的注册中心配置

    参照本代码