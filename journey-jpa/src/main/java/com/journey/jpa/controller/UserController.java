package com.journey.jpa.controller;

import com.journey.jpa.dto.User;
import com.journey.jpa.repository.UserRepository;
import com.journey.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by chen on 2018/4/14.
 */
@RestController
@RequestMapping("/jpa")
public class UserController {


    @Autowired
    private UserRepository userRepository;

    @Autowired
    private UserService userService;

    @RequestMapping("/getUser")
    public List<User> getUsers() {
        List<User> users = userRepository.findAll();

        return users;
    }

    @RequestMapping("/findByOne")
    public User getUser() {
        User user = userRepository.findOne(1);

        return user;
    }

    @RequestMapping("/deleteById")
    public void deleteUser(){
        userRepository.delete(1);
    }

    @RequestMapping("/sayHello")
    public String sayHello(){
        String hello = userService.sayHello();

        return hello;
    }

    @RequestMapping("/findByGender")
    public List<User> findByGender(){
        return userService.findByGender('男');
    }

    @RequestMapping("/change")
    public void changeGender(){
        userService.changeGender('男','女');
    }
}
