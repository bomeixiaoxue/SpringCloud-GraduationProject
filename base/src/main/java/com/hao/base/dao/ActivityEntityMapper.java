package com.hao.base.dao;

import com.hao.base.entity.ActivityEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author hao
 * @date 2019/3/31 1:35
 * description
 */
@Mapper
public interface ActivityEntityMapper {
    /**
     * 根据id获取活动
     * @param id 唯一标识
     * @return ActivityEntity
     */
    ActivityEntity selectById(String id);
}
