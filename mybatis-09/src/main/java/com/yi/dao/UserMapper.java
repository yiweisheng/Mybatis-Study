package com.yi.dao;

import com.yi.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
        //根据ID查询用户
        User queryUserById(@Param("id") int id);

        //更新用户数据
        int updateUser(@Param("user") User user);
}


















