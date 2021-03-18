package com.yi.dao;

import com.yi.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserMapper {

        //查询全部用户
        List<User> getUserList();
        //根据ID查询用户
        User getUserById(int id);
        //inster用户
        int addUser(User user);
        //更改信息
        int updateUser(User user);
        //删除用户
        int deleteUser(int id);
}


















