package com.amos.springbootstudy.controller;

import com.amos.springbootstudy.model.LombokPOJO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping("hello")
    public String helloworld(String name){
        LombokPOJO test=new LombokPOJO(name, 2);
        test.setAge(2);
        return "hello world11123452345" + name;

    }
}
