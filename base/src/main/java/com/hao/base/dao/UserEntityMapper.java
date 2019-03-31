package com.hao.base.dao;


import com.hao.base.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserEntityMapper {

    /**
     * 根据用户名获取用户
     * @param username 用户名
     * @return UserEntity
     */
    UserEntity selectUser(String username);

}
