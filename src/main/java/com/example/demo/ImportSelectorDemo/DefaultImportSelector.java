package com.example.demo.ImportSelectorDemo;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;
public class DefaultImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.example.demo.UselessTypeA","com.example.demo.UselessTypeB"}; // 要注册Bean的类全名
    }
}