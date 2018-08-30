package com.tlc.mybatis.common;

import java.io.Serializable;
import java.util.List;

public interface BaseDao<T> {

    int deleteByPrimaryKey(Serializable id);

    int insert(T record);

    T selectByPrimaryKey(Serializable id);

    int updateByPrimaryKeySelective(T record);

    int updateByPrimaryKey(T record);

    List<T> getList(T record);
}
