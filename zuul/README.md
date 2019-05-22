# 1上传大文件通过zuul

    Uploading Files through Zuul
    If you use @EnableZuulProxy, you can use the proxy paths to upload files and it should work, so long as the files are small. For large files there is an alternative path that bypasses the Spring DispatcherServlet (to avoid multipart processing) in "/zuul/*". In other words, if you have zuul.routes.customers=/customers/**, then you can POST large files to /zuul/customers/*. The servlet path is externalized via zuul.servletPath. If the proxy route takes you through a Ribbon load balancer, extremely large files also require elevated timeout settings, as shown in the following example:
    
    application.yml. 
    
    hystrix.command.default.execution.isolation.thread.timeoutInMilliseconds: 60000
    ribbon:
      ConnectTimeout: 3000
      ReadTimeout: 60000

