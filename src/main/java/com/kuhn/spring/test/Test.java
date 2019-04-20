package com.kuhn.spring.test;

import com.kuhn.spring.config.MianConfig;
import com.kuhn.spring.dto.Person;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by 10331 on 2019/4/20.
 */
public class Test {
    @org.junit.Test
    public void textconfig(){
        AnnotationConfigApplicationContext annotationConfigApplicationContext=new AnnotationConfigApplicationContext(MianConfig.class);
//        Person person= (Person) annotationConfigApplicationContext.getBean("person");
        String[] ss=annotationConfigApplicationContext.getBeanDefinitionNames();
        for(String  s:ss){
            System.out.println(s);
        }

    }
}
