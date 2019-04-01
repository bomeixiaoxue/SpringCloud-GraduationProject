package com.hao.base.dao;


import com.hao.base.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface UserEntityMapper {

    UserEntity selectUser(String username);

    UserEntity get(UserEntity userEntity);

    List<UserEntity> getList(UserEntity userEntity);

    int add(UserEntity userEntity);

    int addList(List<UserEntity> userEntitys);

    int delete(UserEntity userEntity);

    int deleteList(List<UserEntity> userEntitys);

    int update(UserEntity userEntity);

    int updateList(UserEntity userEntity);

}
