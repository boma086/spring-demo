package com.example.demo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//相当于web.xml配置文件<servlet>标签里的内容
@WebServlet(urlPatterns = "/myServlet")
public class MyWebServlet extends HttpServlet {
  @Override
  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  	//向页面中打印SpringBoot Servlet字符串
      response.getWriter().print("SpringBoot Servlet");
      response.getWriter().flush();
      //关闭流
      response.getWriter().close();
  }
  @Override
  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      doGet(request,response);
  }
}