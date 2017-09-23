package com.liutie.dao;

import com.liutie.entity.User;

public interface UserDao {

    int addUser(User user);

    int deleteUserByID(int userId);

    int updateUser(User user);

    User selectUserByUserID(int userId);
}
