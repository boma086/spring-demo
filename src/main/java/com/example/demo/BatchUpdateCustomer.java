package com.example.demo;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class BatchUpdateCustomer {
	@Async("threadPoolTaskExecutor")
	 public void updateCustomer() {
	     // run the background process
		System.out.println("asyn "+ Thread.currentThread().getName());
	}
}
