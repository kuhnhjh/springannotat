package com.kuhn.spring.component;

import org.springframework.context.annotation.FilterType;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * Created by 10331 on 2019/4/21.
 */
public class CustomizeRule implements TypeFilter {
    /**
     * 自定义包扫描选择器
     * @param metadataReader
     * @param metadataReaderFactory
     * @return
     * @throws IOException
     */
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
       System.out.println("当前正在扫描对象："+metadataReader.getAnnotationMetadata().getClassName());
//        if(metadataReader.getAnnotationMetadata().getClassName().contains("ce")){
            return true;
//        }
//        return false;

    }
}
