package com.example.demo.ExceptionDemo;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Component;
import org.springframework.ui.ModelMap;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.databind.ObjectMapper;

@Component
public class MyWebHandlerExceptionResolver implements HandlerExceptionResolver {
	 
    @Override
    public ModelAndView resolveException(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) {
        System.out.println("发生全局异常!");
        ModelMap mmp=new ModelMap();
        mmp.addAttribute("ex",ex.getMessage());
        response.addHeader("Content-Type","application/json;charset=UTF-8");
        try {
            new ObjectMapper().writeValue(response.getWriter(),ex.getMessage());
            response.getWriter().flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ModelAndView();
    }
 
}