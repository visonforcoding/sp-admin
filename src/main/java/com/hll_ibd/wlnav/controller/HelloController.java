package com.hll_ibd.wlnav.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController extends BaseController {

    @RequestMapping("/")
    public String index() {
        // Map<String, Object> context = new HashMap<>();
        // return this.render("home.html", context);
        return "hello,world";
    }

    @RequestMapping("/hi")
    public String hi() {
        Map<String, Object> context = new HashMap<>();
        context.put("websiteTitle", "My First Website");
        context.put("content", "My Interesting Content");
        return this.render("hello/hi.html", context);
    }

}