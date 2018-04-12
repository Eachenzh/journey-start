package com.journey.mybatis.service.impl;

import com.journey.mybatis.dao.UserDao;
import com.journey.mybatis.entity.User;
import com.journey.mybatis.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chen on 2018/4/10.
 */
@Service("userSerivce")
public class UserServiceImpl implements UserSerivce {

    @Autowired
    UserDao userDao;


    @Override
    public List<User> getUser() {
        return userDao.getUser();
    }
}
