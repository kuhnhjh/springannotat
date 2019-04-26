package com.kuhn.spring.config;

import com.kuhn.spring.component.CustomizeRule;
import com.kuhn.spring.component.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.*;

/**
 * 1.Spring注解式开发
 * Created by 10331 on 2019/4/20.
 */
@Configuration
@ComponentScan(value="com.kuhn.spring.component",includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class),
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {CustomizeRule.class})},useDefaultFilters=false)
@Import(MyImportBeanDefinitionRegistrar.class)
public class MianConfig {
//    @Bean
//    public Person person(){
//        return  new Person("黄建辉","男","30");
//    }
}
