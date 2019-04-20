package com.kuhn.spring.config;

import com.kuhn.spring.dto.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by 10331 on 2019/4/20.
 */
@Configuration
@ComponentScan(value="com.kuhn.spring.component")
public class MianConfig {
//    @Bean
//    public Person person(){
//        return  new Person("黄建辉","男","30");
//    }
}
