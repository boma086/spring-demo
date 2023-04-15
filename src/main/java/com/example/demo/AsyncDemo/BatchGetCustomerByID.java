package com.example.demo.AsyncDemo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.FutureTask;

import org.springframework.beans.factory.config.CustomEditorConfigurer;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
@Service
public class BatchGetCustomerByID {
	@Async
	public CompletableFuture getCustomerByID(final String id) throws InterruptedException {
	    //run the process
		System.out.println("getCustomerByID");
		System.out.println(Thread.currentThread().getName());
	    return CompletableFuture.completedFuture(null);
		};
}
