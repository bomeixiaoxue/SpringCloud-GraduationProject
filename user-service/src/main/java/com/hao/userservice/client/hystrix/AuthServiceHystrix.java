package com.hao.userservice.client.hystrix;


import com.hao.userservice.client.AuthServiceClient;
import com.hao.userservice.entity.JWT;
import org.springframework.stereotype.Component;

/**
 * Created by fangzhipeng on 2017/5/31.
 */
@Component
public class AuthServiceHystrix implements AuthServiceClient {
    @Override
    public JWT getToken(String authorization, String type, String username, String password) {
        System.out.println("获取token失败");
        return null;
    }
}
