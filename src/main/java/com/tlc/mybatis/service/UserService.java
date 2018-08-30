package com.tlc.mybatis.service;

import com.tlc.mybatis.common.BaseService;
import com.tlc.mybatis.models.User;

import java.util.List;

public interface UserService extends BaseService<User>{

    public User getNameById(Integer userId);

    public List<User> getAllUsers();
}
