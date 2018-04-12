package com.journey.mybatis.dao;

import com.journey.mybatis.entity.User;

import java.util.List;

/**
 * Created by chen on 2018/4/10.
 */
public interface UserDao {

    /**
     * 查询所有用户
     *
     * @return
     */
    List<User> getUser();

}
