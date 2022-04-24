package com.example.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @RequestMapping("/test")
    public String test() {
        String res = "";
        res += "hotFix say ok ";
        res += "master say ok ";
        return res;
    }
}
