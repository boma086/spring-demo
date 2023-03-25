package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.sym.Name;

@Component
public class Member1 extends Member {
    public Member1() {
        System.out.println("Member1实例化...");
    }
}
