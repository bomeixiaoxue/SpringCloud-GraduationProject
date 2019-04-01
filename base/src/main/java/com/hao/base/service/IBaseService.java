package com.hao.base.service;

import com.hao.base.vo.ResponseVO;

import java.util.List;

/**
 * @author hao
 * @date 2019/3/31 18:38
 * description Service基础接口
 */
public interface IBaseService<T> {

    /**
     * 获取一个实体
     * @param t 实体参数
     * @return 返回数据
     */
    ResponseVO get(T t);

    /**
     * 获取实体列表
     * @param t 实体参数
     * @return 返回数据
     */
    ResponseVO getList(T t);

    /**
     * 新增实体
     * @param t 实体参数
     * @return 返回结果
     */
    ResponseVO add(T t);

    /**
     * 新增实体列表
     * @param t 实体列表参数
     * @return 返回结果
     */
    ResponseVO addList(List<T> t);

    /**
     * 删除实体
     * @param t 实体参数
     * @return 返回结果
     */
    ResponseVO delete(T t);

    /**
     * 删除实体列表
     * @param t 实体列表参数
     * @return 返回结果
     */
    ResponseVO deleteList(List<T> t);

    /**
     * 更新实体
     * @param t 实体参数
     * @return 返回结果
     */
    ResponseVO update(T t);

    /**
     * 更新实体列表
     * @param t 实体列表参数
     * @return 返回结果
     */
    ResponseVO updateList(T t);

}
