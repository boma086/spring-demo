package com.example.demo.ControlDemo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.ConfigurationDemo.MemberAutoConfiguration;

@RestController
@RequestMapping("/beans")
public class MyWebBeanInfoAction {
    @GetMapping("/get")
    public List<String> getBeans() {
        List<String> beans = new ArrayList<>();
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MemberAutoConfiguration.class);
        String[] names = context.getBeanDefinitionNames();
        for (String name : names) {
            beans.add("[" + name + "]" + context.getBean(name).getClass().getSimpleName());
        }
        return beans;
    }
}