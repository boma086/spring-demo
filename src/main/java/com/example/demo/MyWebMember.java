package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.sym.Name;

@RestController
public class MyWebMember {
	@Autowired
    private Member1 member;
	@Autowired
    private BatchUpdateCustomer aaBatchUpdateCustomer;
	@Autowired
	private BatchGetCustomerByID aaBatchGetCustomerByID;

    @RequestMapping("/member")
    public Member getMember() throws InterruptedException {
        System.out.println("member: {}"+member.getClass().getName());
        System.out.println(Thread.currentThread().getName());
        aaBatchUpdateCustomer.updateCustomer();
        aaBatchGetCustomerByID.getCustomerByID("1");
        
        return member;
    }
}