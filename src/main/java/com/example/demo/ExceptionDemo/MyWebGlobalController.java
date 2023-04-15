package com.example.demo.ExceptionDemo;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

//@ControllerAdvice
public class MyWebGlobalController {
 
    @ExceptionHandler(RuntimeException.class)
    public ModelAndView fix1(Exception e){
        System.out.println("全局的异常处理器");
        ModelMap mmp=new ModelMap();
        mmp.addAttribute("ex",e);
        return new ModelAndView("error",mmp);
    }
}