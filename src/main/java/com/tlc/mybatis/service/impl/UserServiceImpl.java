package com.tlc.mybatis.service.impl;

import com.tlc.mybatis.common.BaseDao;
import com.tlc.mybatis.common.BaseServiceImpl;
import com.tlc.mybatis.mapper.UserMapper;
import com.tlc.mybatis.models.User;
import com.tlc.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl extends BaseServiceImpl<User> implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User getNameById(Integer id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<User> getAllUsers() {
        return userMapper.getAllUsers();
    }

    @Override
    public BaseDao<User> getDao() {
        return userMapper;
    }
}
