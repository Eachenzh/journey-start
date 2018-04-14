package com.journey.jpa.service.impl;

import com.journey.jpa.dto.User;
import com.journey.jpa.repository.UserRepository;
import com.journey.jpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by chen on 2018/4/14.
 */
@Service("userService")
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepository userRepository;

    @Override
    public String sayHello() {
        List<User> users = userRepository.findAll();

        String sayHello = null;

        for (User user : users) {
            if (user.getName().equals("宝宝")) {
                sayHello = user.getName() + "在向你打招呼哦";
            }
        }
        return sayHello;
    }

    @Override
    public List<User> findByGender(Character gender) {
        List<User> users = userRepository.findByGender(gender);


        return users;
    }

    @Override
    public void changeGender(Character newGender, Character oldGender) {
        userRepository.changeGender(newGender,oldGender);
    }
}
