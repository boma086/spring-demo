package com.example.demo.BeanPostProcessorDemo;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
public class MyFirstBeanPostProcessor implements BeanPostProcessor {

	public MyFirstBeanPostProcessor() {
		super();
		System.out.println("这是BeanPostProcessor实现类构造器！！");
	}

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1) throws BeansException {
//		System.out.println("BeanPostProcessor接口方法postProcessAfterInitialization对属性进行更改！");
		System.out.println("BeanPostProcessor arround Initialization " + arg0.getClass().getSimpleName());
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1) throws BeansException {
//		System.out.println("BeanPostProcessor接口方法postProcessBeforeInitialization对属性进行更改！");
		return arg0;
	}
}