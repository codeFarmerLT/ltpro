package com.liutie.dao;

import com.liutie.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring/spring-dao.xml"})
public class UserDaoTest {
    //注入依赖
    @Resource
    private UserDao userDao;
    @Test
    public void addUser() throws Exception {
        User user = new User();
        user.setUserName("张三");
        user.setSex('1');
        int insert = userDao.addUser(user);
        System.out.println(insert);
    }

    @Test
    public void deleteUserByID() throws Exception {
    }

    @Test
    public void updateUser() throws Exception {
    }

    @Test
    public void selectUserByUserID() throws Exception {
    }

}