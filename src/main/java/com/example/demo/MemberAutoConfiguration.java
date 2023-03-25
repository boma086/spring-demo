package com.example.demo;
import com.example.demo.Member;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
@Configuration
//@EnableConfigurationProperties(value = Member.class) // Bean注册
//@Import({Member.class, DefaultImportSelector.class})
@Import({Member.class, DefaultImportBeanDefinitionRegistrar.class})
public class MemberAutoConfiguration { // 自动装配类
}