package com.hao.base;

import com.hao.base.dao.ActivityEntityMapper;
import com.hao.base.dao.UserEntityMapper;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author hao
 * @date 2019/3/31 14:43
 * description mapper工厂
 */
@Data
@Component
public class MapperFactory {

    @Autowired
    private UserEntityMapper userEntityMapper;

    @Autowired
    private ActivityEntityMapper activityEntityMapper;

}
