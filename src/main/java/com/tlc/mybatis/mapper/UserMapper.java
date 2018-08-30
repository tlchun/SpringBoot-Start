package com.tlc.mybatis.mapper;

import com.tlc.mybatis.common.BaseDao;
import com.tlc.mybatis.models.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper extends BaseDao<User>{

    public List<User> getAllUsers();
}