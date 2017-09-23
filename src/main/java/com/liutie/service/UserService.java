package com.liutie.service;

import com.liutie.dao.UserDao;
import com.liutie.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {
    @Resource
    private UserDao userDao;
    public boolean userLogin(String userName){
        User user = userDao.selectUserByUserID(1);
        System.out.println(user);
        return user != null;
    }
}
