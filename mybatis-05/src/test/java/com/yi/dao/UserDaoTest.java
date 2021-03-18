package com.yi.dao;

import com.yi.pojo.User;
import com.yi.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.apache.log4j.Logger;
import org.junit.Test;

import java.util.List;


public class UserDaoTest {

    @Test
    public void getUserById() {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        /*
        List<User> users = mapper.getUsers();
        for (User user : users) {
            System.out.println(user);
        }
        */
        /*
        User userByID = mapper.getUserByID(1);
        System.out.println(userByID);
        */
        mapper.addUser(new User(6,"A","123123"));

        sqlSession.close();
    }

}

















