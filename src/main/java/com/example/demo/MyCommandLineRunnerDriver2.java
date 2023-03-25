package com.example.demo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
//@Component
public class MyCommandLineRunnerDriver2 implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunnerDriver2执行成功");
    }
}
