package com.example.demo;

import org.springframework.beans.BeanWrapperImpl;
import org.springframework.beans.DirectFieldAccessor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.web.servlet.HandlerMapping;

@SpringBootApplication
@ServletComponentScan(basePackages = "com.example.demo")
@EnableAsync
public class DemoWeb20230206Application {

    public static void main(String[] args) {
        SpringApplication.run(DemoWeb20230206Application.class, args);
        //http://localhost:8080/member
        //http://localhost:8080/beans/get
      //http://localhost:8080/emp
//        http://localhost:8080/testController/demo1
//        http://localhost:8080/myServlet
        System.out.println("main "+ Thread.currentThread().getName());
//        HandlerMapping.BEST_MATCHING_HANDLER_ATTRIBUTE.chars();
//        new BeanWrapperImpl();
       
    }

}
