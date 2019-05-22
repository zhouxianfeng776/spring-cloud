package com.zhou.test.filer;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.apache.tomcat.util.http.MimeHeaders;

import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.*;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_DECORATION_FILTER_ORDER;
import static org.springframework.cloud.netflix.zuul.filters.support.FilterConstants.PRE_TYPE;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.Field;

/**
 * @author 01384526
 * @title: AddHeaderFiler
 * @projectName spring-cloud
 * @description: TODO
 * @date 2019/5/2215:14
 */
public class AddHeaderFiler extends ZuulFilter {

    @Override
    public int filterOrder() {
        return PRE_DECORATION_FILTER_ORDER - 1; // run before PreDecoration
    }

    @Override
    public String filterType() {
        return PRE_TYPE;
    }

    @Override
    public boolean shouldFilter() {
        RequestContext ctx = RequestContext.getCurrentContext();
        return !ctx.containsKey(FORWARD_TO_KEY) // a filter has already forwarded
                && !ctx.containsKey(SERVICE_ID_KEY); // a filter has already determined serviceId
    }
    @Override
    public Object run() {
        RequestContext ctx = RequestContext.getCurrentContext();
        HttpServletRequest request = ctx.getRequest();
        if (request.getParameter("sample") != null) {
            // put the serviceId in `RequestContext`
            ctx.put(SERVICE_ID_KEY, request.getParameter("foo"));
        }
        return null;
    }

    private void reflectSetparam(HttpServletRequest request,String key,String value){
        Class<? extends HttpServletRequest> requestClass = request.getClass();
        System.out.println("request实现类="+requestClass.getName());
        try {
            Field request1 = requestClass.getDeclaredField("request");
            request1.setAccessible(true);
            Object o = request1.get(request);
            Field coyoteRequest = o.getClass().getDeclaredField("coyoteRequest");
            coyoteRequest.setAccessible(true);
            Object o1 = coyoteRequest.get(o);
            System.out.println("coyoteRequest实现类="+o1.getClass().getName());
            Field headers = o1.getClass().getDeclaredField("headers");
            headers.setAccessible(true);
            MimeHeaders o2 = (MimeHeaders)headers.get(o1);
            o2.addValue(key).setString(value);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
