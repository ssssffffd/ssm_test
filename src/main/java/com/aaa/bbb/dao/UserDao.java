package com.aaa.bbb.dao;

import com.aaa.bbb.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2016/7/10.
 */


public interface UserDao {

    public User getUserByName(String username);
    public void addUser(User user);
}
