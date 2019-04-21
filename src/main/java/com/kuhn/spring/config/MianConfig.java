package com.kuhn.spring.config;

import com.kuhn.spring.dto.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

/**
 * Created by 10331 on 2019/4/20.
 */
@Configuration
@ComponentScan(value="com.kuhn.spring.component",includeFilters = {
//        @ComponentScan.Filter(type = FilterType.ANNOTATION,classes = Controller.class),
        @ComponentScan.Filter(type = FilterType.CUSTOM,classes = {CustomizeRule.class})

},useDefaultFilters=false)
/**
 * 1.Spring注解式开发
 */
public class MianConfig {
//    @Bean
//    public Person person(){
//        return  new Person("黄建辉","男","30");
//    }
}
