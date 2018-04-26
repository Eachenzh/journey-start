package com.journey.jpa.test;

import com.journey.jpa.dto.User;
import com.journey.jpa.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by chen on 2018/4/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class Test01 {

    @Autowired
    private UserService userService;

    @Test
    public void findOne() throws Exception {
        List<User> users = userService.findByGender('女');
        for (User user : users) {
            Assert.assertArrayEquals(new Object[]{
                    user.getName().length() >= 1,
                    user.getAge() >= 15,
                    user.getGender() == '男'
            }, new Object[]{
                    true,
                    true,
                    false
            });
        }
    }
}
