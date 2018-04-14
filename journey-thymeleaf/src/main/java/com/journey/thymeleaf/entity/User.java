package com.journey.thymeleaf.entity;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * Created by chen on 2018/4/14.
 */
@Getter
@Setter
public class User implements Serializable {

    private Integer id;

    private String name;

    private Integer age;

    private Character gender;
}
