package com.journey.mybatis.controller;

import com.journey.mybatis.entity.User;
import com.journey.mybatis.service.UserSerivce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by chen on 2018/4/10.
 */
@RestController
@RequestMapping("/mybatis")
public class MybatisController {

    @Autowired
    UserSerivce userSerivce;

    @RequestMapping("/test1")
    public List<User> getUser(HttpServletRequest request) {
//        int userId = Integer.parseInt(request.getParameter("id"));
        List<User> user = userSerivce.getUser();
        return user;
    }
}
