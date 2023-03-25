package com.example.demo;

import java.util.concurrent.Executor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor;

//@Configuration
public class BatchTaskAsyncExecutor {
	@Bean(name = "threadPoolTaskExecutor")
	public Executor asyncExecutor() {
	   ThreadPoolTaskExecutor executor = new ThreadPoolTaskExecutor();
	   executor.setCorePoolSize(4);
	   executor.setMaxPoolSize(4);
	   executor.setQueueCapacity(50);
	   executor.setThreadNamePrefix("AsynchThread::");
	   executor.initialize();
	   return executor;
	}
}
