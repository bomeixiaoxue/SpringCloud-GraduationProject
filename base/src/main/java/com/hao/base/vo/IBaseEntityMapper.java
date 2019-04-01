package com.hao.base.vo;

import java.util.List;
import java.util.Map;

/**
 * @author hao
 * @date 2019/3/31 19:41
 * description
 */
public interface IBaseEntityMapper<T> {

    /**
     * 获取t实体
     * @param t 实体
     * @return t 实体
     */
    T get(T t);

    List<T> getList(Map<String, Object> params);

    int add(T t);

    int addList(List<T> t);

    int delete(T t);

    int deleteList(List<T> t);

    int update(T t);

    int updateList(T t);

}
