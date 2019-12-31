package com.dazmon.application.base;

import java.util.List;
import java.util.Map;

public interface BaseDao<T> {
    //增
    public  int insert(String mapper,Object parameter)throws Exception;

    //改
    public int update(String mapper,Object parameter)throws Exception;

    //删
    public int delete(String mapper,Object parameter)throws Exception;

    //查
    public T selectOne(String mapper, Object parameter)throws Exception;

    public List<T> selectList(String mapper,Object parameter)throws Exception;

}
