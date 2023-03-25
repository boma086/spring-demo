package com.example.demo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/**
 * @Author Christy
 * @Date 2021/9/28 10:44
 **/
@RestController
@RequestMapping("/interceptor")
public class MyWebInterceptorController {
	@Autowired
	private Person person;
	@Autowired
	private MyFirstBeanPostProcessor myBeanPostProcessor;
    private static final Logger log = LoggerFactory.getLogger(MyWebInterceptorController.class);
    @RequestMapping("sayHello")
    public String sayHello(){
        log.info("Hello Interceptor…");
        return "interceptor";
    }
}