package com.hao.ssoservice.sso.config;


import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author hao
 * @date 2019/3/28 20:32
 * description 密码加密类，可以自定义密码的加密方式
 */
public class MyPasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String s) {
        return s.equals(charSequence);
    }

}
