package com.hao.chatservice.controller;

import com.hao.base.MapperFactory;
import com.hao.chatservice.service.IChat;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.security.oauth2.client.OAuth2RestTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class ChatController {

    @Resource
    private OAuth2RestTemplate oAuth2RestTemplate;

    @Resource
    private MapperFactory mapperFactory;

    @Resource
    private IChat iChat;

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
