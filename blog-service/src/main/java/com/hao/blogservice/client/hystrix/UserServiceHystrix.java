package com.hao.blogservice.client.hystrix;

import com.hao.dto.RespDTO;
import com.hao.blogservice.client.UserServiceClient;
import com.hao.blogservice.entity.User;
import org.springframework.stereotype.Component;


/**
 * Created by fangzhipeng on 2017/5/31.
 */
@Component
public class UserServiceHystrix implements UserServiceClient {

    @Override
    public RespDTO<User> getUser(String token, String username) {
        System.out.println(token);
        System.out.println(username);
        return null;
    }
}
