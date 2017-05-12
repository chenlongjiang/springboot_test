package com.chenlong.controller;

import com.chenlong.configuration.GirlProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by dell、 on 2017/5/12.
 */
@RestController
public class HelloController {
    /*@Value("${cupsize}")
    private String cupSize;
    @Value("${content}")
    private String content;*/
    @Autowired
    private GirlProperties girlProperties;
    @RequestMapping(value = "/hello",method = RequestMethod.GET)
    public String say(){
        return "Hello Springboot!" + girlProperties.getCupsize() + girlProperties.getAge();
    }
}
