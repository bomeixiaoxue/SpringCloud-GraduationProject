package com.hao.newsservice.controller;

import com.hao.base.MapperFactory;
import com.hao.newsservice.service.INews;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class NewsController {

    @Resource
    private OAuth2RestTemplate oAuth2RestTemplate;

    @Resource
    private INews iNews;

    @Resource
    private MapperFactory mapperFactory;

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
        String messagesUrl = "http://activity-service/activity/getName";
        String result = oAuth2RestTemplate.getForObject(messagesUrl, String.class);
        return result;
    }

    @RequestMapping("/api")
    @ResponseBody
    @PreAuthorize(value = "hasRole('ROLE_USER')")
    String home(Model model) {
        System.err.println("测试" + mapperFactory.getUserEntityMapper().selectUser("admin").toString());
        String messagesUrl = "http://activity-service/activity/api/2";
        String result = oAuth2RestTemplate.getForObject(messagesUrl, String.class);
        return result;
    }

}
