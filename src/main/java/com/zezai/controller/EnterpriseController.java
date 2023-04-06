package com.zezai.controller;

import com.zezai.domain.Enterprise;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;

//@RestController
//@RequestMapping("/books")
public class EnterpriseController {
    @Value("${name}")
    private String name;

    @Autowired
    private Environment environment;

    @Autowired
    private Enterprise enterprise;
    @GetMapping
    public String getAll(){
        System.out.println("通过给自定义变量赋值获取值"+name);
        System.out.println("通过Environment接口实现类获取值"+environment.getProperty("name"));
        System.out.println("通过自定义对象封装获取值"+ enterprise.getName());
        return "Books";
    }
}
