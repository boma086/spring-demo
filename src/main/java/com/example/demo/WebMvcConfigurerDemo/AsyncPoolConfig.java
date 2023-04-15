package com.example.demo.WebMvcConfigurerDemo;

import java.util.concurrent.ThreadPoolExecutor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;
import org.springframework.web.context.request.async.TimeoutCallableProcessingInterceptor;
import org.springframework.web.servlet.config.annotation.AsyncSupportConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/** * 异步线程配置类 */
//@Configuration
public class AsyncPoolConfig implements WebMvcConfigurer {
    @Override
    public void configureAsyncSupport(AsyncSupportConfigurer configurer) {
        configurer.setDefaultTimeout(1000); //超时时间
        configurer.registerCallableInterceptors(timeoutInterceptor()); // timeout拦截器
        configurer.setTaskExecutor(getThreadPoolTaskExecutor());
    }
    @Bean(name = "asyncPoolTaskExecutor")
    public ThreadPoolTaskExecutor getThreadPoolTaskExecutor() {
        ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
        executor.setCorePoolSize(20); // 核心线程数
        executor.setMaxPoolSize(100); // 最大线程数
        executor.setQueueCapacity(25); // 工作队列大小
        executor.setKeepAliveSeconds(200); // 线程无任务存活时间
        executor.setThreadNamePrefix("async-pool-task-"); // 线程名前缀
        executor.setRejectedExecutionHandler(new ThreadPoolExecutor.CallerRunsPolicy()); // 拒绝策略
        return executor;
    }
    @Bean
    public TimeoutCallableProcessingInterceptor timeoutInterceptor() {
        return new TimeoutCallableProcessingInterceptor();
    }
}