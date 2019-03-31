package com.hao.competitionservice.Controller;


import com.hao.base.MapperFactory;
import com.hao.competitionservice.service.ICompetition;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @author hao
 * @date 2019/3/29 10:17
 * description
 */
@Controller
public class CompetitionController {

    @Resource
    private ICompetition iCompetition;

    @Resource
    private MapperFactory mapperFactory;

    @RequestMapping(value = "/index")
    public String index() {
        System.err.println("测试12：" + mapperFactory.getUserEntityMapper().selectUser("admin").toString());
        return "index";
    }

}
