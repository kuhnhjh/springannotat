package com.kuhn.spring.component;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

/**
 * Created by 10331 on 2019/4/21.
 */
@Controller
@Scope("singleton")
@Lazy(true)
/**
 * bean的作用范围
 */
//String SCOPE_SINGLETON = "singleton";
//String SCOPE_PROTOTYPE = "prototype";
public class PersonController {
    public PersonController() {
        System.out.println("PersonController 初始化===》");
    }
}
