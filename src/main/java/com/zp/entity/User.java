package com.zp.entity;

import lombok.Data;

import java.util.Date;

/**
 * @author lixinjian
 * @Date 2019/6/4 21:18
 */
@Data
public class User {

    private Integer uid;
    private String username;
    private String password;
    private Date birth;
    private String education;
    private String school;
    private String major;
    private Integer work_year;
    private String phone;
    private String email;
    private String home;

}
