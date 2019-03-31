package com.hao.ssoservice.sso.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.oauth2.provider.token.ConsumerTokenServices;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author hao
 * @date 2019/3/28 20:32
 * description
 */
@RestController
public class SsoController {

    @Resource
    private ConsumerTokenServices consumerTokenServices;

    @GetMapping("/authentication/require")
    public ModelAndView require() {
        return new ModelAndView("ftl/login");
    }

    @GetMapping("/authentication/loginout")
    public ModelAndView loginout(HttpServletRequest request, HttpServletResponse response) {
        System.err.println("调用退出: " + SecurityContextHolder.getContext().getAuthentication().getDetails().toString());
        // token can be revoked here if needed
        new SecurityContextLogoutHandler().logout(request, null, null);
        try {
            //sending back to client app
            response.sendRedirect(request.getHeader("referer"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new ModelAndView("ftl/login");
    }

    @RequestMapping("authentication/exit")
    public void exit(HttpServletRequest request, HttpServletResponse response) {
        System.err.println("调用退出: " + SecurityContextHolder.getContext().getAuthentication().getDetails().toString());
        // token can be revoked here if needed
        new SecurityContextLogoutHandler().logout(request, null, null);
        try {
            //sending back to client app
            response.sendRedirect(request.getHeader("referer"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @GetMapping("/user")
    @ResponseBody
    public Authentication user(Authentication user) {
        return user;
    }


}
