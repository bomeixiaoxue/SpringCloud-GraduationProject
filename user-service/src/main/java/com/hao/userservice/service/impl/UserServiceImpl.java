package com.hao.userservice.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.hao.base.MapperFactory;
import com.hao.base.entity.UserEntity;
import com.hao.base.vo.ResponseCodeVO;
import com.hao.base.vo.ResponseVO;
import com.hao.userservice.service.IUserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang.StringUtils;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author hao
 * @date 2019/3/31 15:57
 * description
 */
@Slf4j
@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private MapperFactory mapperFactory;

    @Override
    public ResponseVO get(UserEntity userEntity) {
        log.info("查询用户参数：{}", userEntity);
        if (StringUtils.isEmpty(userEntity.getID()) && StringUtils.isEmpty(userEntity.getUsername())) {
            log.info("查询结果：{}", ResponseCodeVO.PARAMISEMTPY);
            return new ResponseVO<>(ResponseCodeVO.PARAMISEMTPY.getCode(), ResponseCodeVO.PARAMISEMTPY.getName(), userEntity);
        }
        userEntity = mapperFactory.getUserEntityMapper().get(userEntity);
        log.info("查询结果：{}", userEntity);
        return new ResponseVO<>(userEntity);
    }

    @Override
    public ResponseVO getList(UserEntity userEntity) {
        log.info("分页查询用户参数：{}", userEntity);
        PageHelper.startPage(1, 1);
        List<UserEntity> userEntitys = mapperFactory.getUserEntityMapper().getList(userEntity);
        PageInfo<UserEntity> pageInfo = new PageInfo<>(userEntitys);
        log.info("分页查询结果：{}", pageInfo);
        return new ResponseVO<>(userEntitys);
    }

    @Override
    public ResponseVO add(UserEntity userEntity) {

        return null;
    }

    @Override
    public ResponseVO addList(List<UserEntity> t) {
        return null;
    }

    @Override
    public ResponseVO delete(UserEntity userEntity) {
        return null;
    }

    @Override
    public ResponseVO deleteList(List<UserEntity> t) {
        return null;
    }

    @Override
    public ResponseVO update(UserEntity userEntity) {
        return null;
    }

    @Override
    public ResponseVO updateList(UserEntity userEntity) {
        return null;
    }

}
