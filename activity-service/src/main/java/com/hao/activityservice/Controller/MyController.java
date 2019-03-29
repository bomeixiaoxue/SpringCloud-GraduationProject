package com.hao.activityservice.Controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hao
 * @date 2019/3/28 17:05
 * description
 */
@RestController
public class MyController {

    @RequestMapping(value = "/getName")
    @PreAuthorize(value = "hasRole('ROLE_USER')")
    public String getName(){
        return "林广豪";
    }

    @GetMapping("/api/{id}")
    public String get(@PathVariable("id") String id) {
        System.out.println("id=" + id);
        return "hello resource";
    }

}
