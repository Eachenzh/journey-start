package com.journey.jpa.dto;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by chen on 2018/4/14.
 */
@Getter
@Setter
@Entity
@Table(name = "journey_user")
public class User {

    @Id
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @Column(name = "gender")
    private Character gender;



}
