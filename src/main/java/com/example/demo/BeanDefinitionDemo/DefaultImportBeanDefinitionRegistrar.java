package com.example.demo.BeanDefinitionDemo;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import com.example.demo.UselessTypeA;
import com.example.demo.UselessTypeB;

public class DefaultImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar {
    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        RootBeanDefinition uselessBeanA = new RootBeanDefinition(UselessTypeA.class);
        RootBeanDefinition uselessBeanB = new RootBeanDefinition(UselessTypeB.class);
        registry.registerBeanDefinition("uselessBeanA", uselessBeanA);
        registry.registerBeanDefinition("uselessBeanB", uselessBeanB);
    }
}
