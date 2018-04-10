package com.journey.mybatis.dao;

import com.journey.mybatis.entity.User;

/**
 * Created by chen on 2018/4/10.
 */
public interface UserDao {

    /**
     * 查询所有用户
     * @return
     */
    User getUser(int userId);

}
