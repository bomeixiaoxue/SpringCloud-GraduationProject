package com.hao.userservice.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/login")
    public String login(){
        System.err.println("进入登录123");
        return "login";
    }

    @RequestMapping(value = "/index")
    public String index(){
        System.err.println("进入主页");
        return "index";
    }

}
