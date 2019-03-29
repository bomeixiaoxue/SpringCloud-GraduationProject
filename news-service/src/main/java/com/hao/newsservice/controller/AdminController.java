package com.hao.newsservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AdminController {

    @Autowired
    OAuth2RestTemplate oAuth2RestTemplate;

    @Value("${messages.url:http://localhost:8085}/resource")
    String messagesUrl;

    @GetMapping("/user")
    @ResponseBody
    public Authentication user(Authentication user) {
        return user;
    }

    @RequestMapping("/admin")
    String admin(Model model) {
        return "index";
    }

    @RequestMapping("/test")
    String test(Model model) {
        return "test";
    }

    @RequestMapping("/name")
    @ResponseBody
    String getName(Model model) {
        String result = oAuth2RestTemplate.getForObject(messagesUrl + "/getName", String.class);
        return result;
    }

    @RequestMapping("/api")
    @ResponseBody
    @PreAuthorize(value = "hasAuthority('ROLE_USER')")
    String home(Model model) {
        String result = oAuth2RestTemplate.getForObject(messagesUrl + "/api/2", String.class);
        return result;
    }

}
