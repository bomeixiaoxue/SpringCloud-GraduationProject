package com.hao.activityservice.controller;

import com.hao.activityservice.service.IActivity;
import com.hao.base.MapperFactory;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author hao
 * @date 2019/3/28 17:05
 * description
 */
@RestController
public class ActivityController {

    @Resource
    private IActivity iActivity;

    @Resource
    private MapperFactory mapperFactory;

    @RequestMapping(value = "/getName")
    @PreAuthorize(value = "hasRole('ROLE_USER')")
    public String getName(){
        return "林广豪";
    }

    @GetMapping("/api/{id}")
    public String get(@PathVariable("id") String id) {
        System.err.println("活动：" + mapperFactory.getActivityEntityMapper().selectById("1").toString());
        System.err.println("测试" + mapperFactory.getUserEntityMapper().selectUser("admin").toString());
        return "hello: " + mapperFactory.getUserEntityMapper().selectUser("admin").toString();
    }

}
