package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Member2 extends Member {
    public Member2() {
        System.out.println("Member2实例化...");
    }
}
