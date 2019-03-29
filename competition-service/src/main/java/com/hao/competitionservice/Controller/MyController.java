package com.hao.competitionservice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author hao
 * @date 2019/3/29 10:17
 * description
 */
@Controller
public class MyController {

    @RequestMapping(value = "/index")
    public String index() {
        return "index";
    }

}
