package com.example.demo;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;


@Configuration
@Order(1)
public class MyCustomFilter1 implements Filter {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyCustomFilter1.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        LOGGER.info("########## Initiating Custom filter 1 init ##########");
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        LOGGER.info("Logging Request 1 - #### --->  {} : {}", request.getMethod(), request.getRequestURI());
        //call next filter in the filter chain
        filterChain.doFilter(request, response);
        LOGGER.info("Logging Response1  - ##### -->   :{}", response.getContentType());
    }
    @Override
    public void destroy() {
        LOGGER.info("########## Destroying Custom filter 1 ##########");
    }
}