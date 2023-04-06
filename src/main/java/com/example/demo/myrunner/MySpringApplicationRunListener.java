package com.example.demo.myrunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
public class MySpringApplicationRunListener implements SpringApplicationRunListener {
    public MySpringApplicationRunListener(SpringApplication application, String[] args) {
    }
    public void starting() {
        System.out.println("SpringApplicationRunListener——>starting()");
    }
    public void environmentPrepared(ConfigurableEnvironment environment) {
        // 可以获取当前机器的操作系统等信息
        Object mes = environment.getSystemProperties().get("os.name");
        System.out.println("SpringApplicationRunListener——>environmentPrepared()---操作系统："+mes);
    }
    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.println("春SpringApplicationRunListener——>contextPrepared()");
    }
    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("春SpringApplicationRunListener——>contextLoaded()");
    }
    @Override
    public void started(ConfigurableApplicationContext context) {
        System.out.println("春SpringApplicationRunListener——>started()");
    }
    @Override
    public void running(ConfigurableApplicationContext context) {
        System.out.println("春SpringApplicationRunListener——>running()");
    }
    @Override
    public void failed(ConfigurableApplicationContext context, Throwable exception) {
        System.out.println("春SpringApplicationRunListener——>failed()");
    }
}