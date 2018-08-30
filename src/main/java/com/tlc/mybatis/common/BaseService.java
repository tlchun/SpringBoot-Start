package com.tlc.mybatis.common;

import java.io.Serializable;
import java.util.List;

public interface BaseService<T> {

    public int insert(T t);

    public int update(T t);

    int updateByPrimaryKeySelective(T record);

    public void delete(Serializable id);

    public List<T> getList(T t);

    public T get(Serializable id);
}
