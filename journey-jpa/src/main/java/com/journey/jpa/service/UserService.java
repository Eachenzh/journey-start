package com.journey.jpa.service;

import com.journey.jpa.dto.User;

import java.util.List;

/**
 * Created by chen on 2018/4/14.
 */
public interface UserService {

    String sayHello();

    List<User> findByGender(Character gender);

    void changeGender(Character newGender,Character oldGender);
}
