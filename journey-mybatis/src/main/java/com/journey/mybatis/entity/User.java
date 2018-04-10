package com.journey.mybatis.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by chen on 2018/4/10.
 */
@Getter
@Setter
public class User implements Serializable{

    private Integer id;

    //姓名
    private String name;

    //年龄
    private Integer age;

    //性别
    private Character gender;
}
