package com.example.interceptors.Interceptors;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WelcomeInterceptor implements HandlerInterceptor {
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("Pre handle method is working");
        request.setAttribute("StartTime",System.currentTimeMillis());
        return true;
    }

    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable ModelAndView modelAndView) throws Exception {
       long time=(long) request.getAttribute("StartTime");
       long timetaken=System.currentTimeMillis()-time;
        System.out.println("The time taken for processing the request is "+timetaken);
    }

    public  void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, @Nullable Exception ex) throws Exception {
        System.out.println("After complete method is working");
    }

}
