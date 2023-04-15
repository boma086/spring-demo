package com.example.demo.FilterDemo;

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
import org.springframework.core.annotation.Order;

public class MyCustomFilter implements Filter {
    private static final Logger LOGGER = LoggerFactory.getLogger(MyCustomFilter.class);
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        LOGGER.info("########## Initiating MyCustomFilter filter ##########");
    }
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        LOGGER.info("This Filter is only called when request is mapped for /filterExample resource");
        //call next filter in the filter chain
        filterChain.doFilter(request, response);
    }
    @Override
    public void destroy() {
        LOGGER.info("########## Destroying MyCustomFilter filter ##########");
    }
}