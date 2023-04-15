package com.example.demo.ControlDemo;

import java.util.concurrent.Callable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MyWebMessageAction {
    @RequestMapping("/echo")
    public Object echo(String message) {
        System.out.println("【用户线程】" + Thread.currentThread().getName());
        return new Callable<String>() {
            @Override
            public String call() throws Exception {
                System.out.println("【任务线程】" + Thread.currentThread().getName());
                return "[ECHO]" + message;
            }
        };
    }
}