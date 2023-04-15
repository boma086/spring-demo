package com.example.demo.WebMvcConfigurerAdapterDemo;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.demo.InterceptorDemo.MyInterceptor01;
/**
 * @Author Christy
 * @Date 2021/9/15 16:24
 **/
@Configuration
public class MyWebMvcConfigurer implements WebMvcConfigurer {
    /**
     * 配置拦截器
     * addInterceptor()： 指定拦截器
     * addPathPatterns("/**")：拦截所有Controller请求
     * excludePathPatterns("/file/**")：排除文件操作的请求路径
     * order()：指定拦截器执行顺序 int 类型数字: 默认按照自然排序执行 数字相同时,按照配置顺序执行
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyInterceptor01())
                .addPathPatterns("/interceptor")
//                .addPathPatterns("/**")
                .excludePathPatterns("/file/**")
                .order(1);
    }
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        /**
         * 文件上传到服务器后并不能在项目中直接访问，需要将磁盘路径映射成虚拟路径使用http://domain/的方式才可以
         */
        String os = System.getProperty("os.name");
        if(os.toLowerCase().startsWith("win")){
            // Windows虚拟路径映射本地磁盘
            registry.addResourceHandler("/**").addResourceLocations("file:");
        } else {
            // Linux虚拟路径映射本地磁盘
            registry.addResourceHandler("/**").addResourceLocations("file:");
        }
    }
}
