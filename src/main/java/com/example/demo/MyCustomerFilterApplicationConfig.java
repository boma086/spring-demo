package com.example.demo;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;

@Configuration
public class MyCustomerFilterApplicationConfig {
    @Bean
    public FilterRegistrationBean<MyCustomFilter> filterRegistrationBean() {
        FilterRegistrationBean < MyCustomFilter > registrationBean = new FilterRegistrationBean<>();
        MyCustomFilter myCustomFilter = new MyCustomFilter();
        registrationBean.setFilter(myCustomFilter);
        registrationBean.setOrder(Ordered.HIGHEST_PRECEDENCE);
        registrationBean.addUrlPatterns("/filterExample/*");
        registrationBean.setOrder(2); //set precedence
        return registrationBean;
    }
}