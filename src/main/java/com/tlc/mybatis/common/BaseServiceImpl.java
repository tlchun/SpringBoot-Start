package com.tlc.mybatis.common;

import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.List;


public abstract class BaseServiceImpl<T> implements BaseService<T> {

    public abstract BaseDao<T> getDao();

    @Override
    @Transactional
    public int insert(T t) {
        return getDao().insert(t);
    }

    @Override
    @Transactional
    public int update(T t) {
        return getDao().updateByPrimaryKey(t);
    }

    @Override
    @Transactional
    public int updateByPrimaryKeySelective(T record) {
        return getDao().updateByPrimaryKeySelective(record);
    }

    @Override
    @Transactional
    public void delete(Serializable id) {
        getDao().deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<T> getList(T t) {
        return getDao().getList(t);
    }

    @Override
    @Transactional(readOnly = true)
    public T get(Serializable id) {
        return getDao().selectByPrimaryKey(id);
    }
}
