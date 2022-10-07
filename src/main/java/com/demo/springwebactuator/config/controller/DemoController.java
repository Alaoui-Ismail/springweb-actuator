package com.demo.springwebactuator.config.controller;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/api")
@ComponentScan("com.demo.springwebactuator.config")
public class DemoController {


    @GetMapping("/hello")
    public String sayHello() {
        return "hellopage";
    }
}
