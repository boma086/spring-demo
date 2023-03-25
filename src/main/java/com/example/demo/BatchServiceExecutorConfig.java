package com.example.demo;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.AsyncConfigurer;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

//@Configuration
public class BatchServiceExecutorConfig implements AsyncConfigurer {
 @Override
 public Executor getAsyncExecutor() {
  ThreadPoolTaskExecutor taskExecutor = new ThreadPoolTaskExecutor();
  taskExecutor.setCorePoolSize(4);
  taskExecutor.setMaxPoolSize(4);
  taskExecutor.setQueueCapacity(50);
  taskExecutor.setThreadNamePrefix("AsyncConfigurer");
  taskExecutor.initialize();
  return taskExecutor;
 }
}