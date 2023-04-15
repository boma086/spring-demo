package com.example.demo.FilterDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyWebFilterExampleController {
    @GetMapping(value = "/filterExample")
    public String customGreetings() {
        return "Hello From Custom Filter Example";
    }
}