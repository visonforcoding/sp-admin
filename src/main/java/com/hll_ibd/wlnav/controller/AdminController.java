package com.hll_ibd.wlnav.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.hll_ibd.wlnav.Res;

import org.springframework.web.bind.annotation.RequestMethod;

import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/admin")
public class AdminController extends BaseController {

    @RequestMapping("/index")
    public String index() {
        Map<String, Object> context = new HashMap<>();
        return this.render("admin/index.html", context);
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String login() {
        Map<String, Object> context = new HashMap<>();
        context.put("login", "中国");
        return this.render("admin/login.html", context);
    }

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Res<?> handLogin(HttpServletRequest request,HttpSession session) {
        String username = request.getParameter("name");
        String password = request.getParameter("password");
        HashMap<String, String> data = new HashMap<>();
        String msg = "登录失败";
        Integer ret = 1;
        if (username.equals("vison.cao")) {
            session.setAttribute("user", username);
            System.out.println("session has 存储" + session.getId());
            msg = "登录成功";
            ret = 0;
            data.put("redirect", "/admin/index");
        }
        return new Res<HashMap<String, String>>(ret, msg, data);
    }

    @RequestMapping("/hello")
    public String hi() {
        Map<String, Object> context = new HashMap<>();
        context.put("websiteTitle", "My First Website");
        context.put("content", "My Interesting Content");
        return this.render("hello/hi.html", context);
    }

}