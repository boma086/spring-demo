package com.example.demo.initializingBean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class TestDao  implements InitializingBean, DisposableBean {
    public TestDao() {
        System.out.println("TestDao constructor");
    }

    @Async
    public void query(){
        System.out.println("TestDao Hello Spring!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("TestDao afterPropertiesSet");
    }
    @javax.annotation.PostConstruct
    public void PostConstruct(){
        System.out.println("TestDao PostConstruct");
    }

    public void InitMethod(){
        System.out.println("TestDao InitMethod");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("TestDao destroy");
    }
    @javax.annotation.PreDestroy
    public void PreDestroy(){
        System.out.println("TestDao PreDestroy");
    }
    public void destroyMethod(){
        System.out.println("TestDao destroyMethod");
    }
}