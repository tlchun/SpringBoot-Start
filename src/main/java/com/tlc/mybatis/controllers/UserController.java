package com.tlc.mybatis.controllers;

import com.tlc.mybatis.common.JsonResult;
import com.tlc.mybatis.models.User;
import com.tlc.mybatis.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1/user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/get")
    public Object getUserById(Integer userId) {

        User user = userService.getNameById(userId);

        return JsonResult.success(user);
    }

    @ResponseBody
    @RequestMapping(value = "/add")
    public int addUser(User user) {
        return 0;
    }

    @ResponseBody
    @RequestMapping(value = "/getAll")
    public Object getAllUsers() {
        List<User> list = userService.getAllUsers();

        return JsonResult.success(list);
    }
}
