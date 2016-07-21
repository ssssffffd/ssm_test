package com.aaa.bbb.service;

import com.aaa.bbb.dao.UserDao;
import com.aaa.bbb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/7/10.
 */

@Service
public class UserService{

    @Autowired
    private UserDao userDao;

    public User checkLogin(String username, String password) {
        User user = userDao.getUserByName(username);
        if(user != null && user.getPassword().equals(password)){
            return user;
        }
        return null;
    }

    public void register(User user) {
        userDao.addUser(user);
    }
}
