package com.hao.base.controller;

import com.hao.base.dao.UserEntityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hao
 * @date 2019/3/30 20:40
 * description
 */
@RestController
public class BaseContrroller {

    @Autowired
    private UserEntityMapper userEntityMapper;

    @RequestMapping(value = "/name")
    public String name(){
        System.err.println(userEntityMapper.selectUser("admin"));
        return "林广豪";
    }

}
