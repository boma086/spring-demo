package com.example.demo.InterceptorDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/** * 自定义拦截器 * @Author Christy * @Date 2021/9/28 10:20 **/
public class MyInterceptor01 implements HandlerInterceptor {
    private static final Logger log = LoggerFactory.getLogger(MyInterceptor01.class);
    /** * * @author Christy * @date 2021/9/28 10:22 * @param request * @param response * @param handler 当前请求请求的控制器方法对象 InterceptorController#sayHello * @return boolean * true：表示放行当前请求 * false：终端当前请求 例如做权限校验时如果校验不通过我们可以使用response.sendRedirect(request.getContextPath()+"/login.suffix");跳转到登录界面 */
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        log.info("==========MyInterceptor01==========handler=========" + handler);
        log.info("==========MyInterceptor01==========preHandle=========");
        return true;
    }
    /** * * @author Christy * @date 2021/9/28 10:28 * @param request * @param response * @param handler 当前请求请求的控制器方法对象 InterceptorController#sayHello * @param modelAndView 模型和视图 当前请求访问方法的 modelandview 对象 * @return void */
    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        log.info("==========MyInterceptor01==========postHandle=========");
    }
    /** * * @author Christy * @date 2021/9/28 10:29 * @param request * @param response * @param handler 当前请求请求的控制器方法对象 InterceptorController#sayHello * @param ex 如果控制器出现异常时异常对象 * @return void */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.info("==========MyInterceptor01==========ex========={}", ex);
        log.info("==========MyInterceptor01==========afterCompletion=========");
    }
}