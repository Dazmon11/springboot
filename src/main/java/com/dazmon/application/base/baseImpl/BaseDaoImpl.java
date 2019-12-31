package com.dazmon.application.base.baseImpl;

import com.dazmon.application.base.BaseDao;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
import java.util.List;


/*
 * BaseDao实现类，使用SqlSessionTemplate 模版
 * */
@Repository
public class BaseDaoImpl<T> implements BaseDao<T> {

    @Resource
    private SqlSessionTemplate sqlSessionTemplate;

    //增
    @Override
    public int insert(String mapper, Object parameter) throws Exception{
        return sqlSessionTemplate.insert(mapper,parameter);
    }

    //改
    @Override
    public int update(String mapper, Object parameter) throws Exception{
        return sqlSessionTemplate.update(mapper,parameter);
    }

    //删
    @Override
    public int delete(String mapper,Object parameter) throws Exception{
        return sqlSessionTemplate.delete(mapper,parameter);
    }

    //查
    @Override
    public T selectOne(String mapper, Object parameter) throws Exception{
        return sqlSessionTemplate.selectOne(mapper,parameter);
    }

    @Override
    public List<T> selectList(String mapper, Object parameter) throws Exception{
        return sqlSessionTemplate.selectList(mapper,parameter);
    }
}
