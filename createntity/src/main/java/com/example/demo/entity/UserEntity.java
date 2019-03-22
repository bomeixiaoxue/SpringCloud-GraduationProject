package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

/**
 * @author hao
 * @date 2019/3/22 9:49
 * description 用户信息实体
 */

@Data
@Entity(name = "u_user")
public class UserEntity extends BaseEntity {

    @Column(name = "loginID", columnDefinition = "varchar(32) COMMENT '登陆账号'", nullable = false, unique = true)
    private String loginID;

    @Column(name = "password", columnDefinition = "varchar(255) COMMENT '密码'", nullable = false)
    private String password;

    @Column(name = "realName", columnDefinition = "varchar(255) COMMENT '真实姓名'", nullable = false)
    private String realName;

    @Column(name = "nickName", columnDefinition = "varchar(255) COMMENT '昵称'", nullable = false)
    private String nickName;

    @Column(name = "signature", columnDefinition = "varchar(255) COMMENT '个性签名'")
    private String signature;

    @Column(name = "sex", columnDefinition = "bit(1) COMMENT '性别:0女、1男'", nullable = false)
    private String sex;

    @Column(name = "birthday", columnDefinition = "datetime COMMENT '生日'", nullable = false)
    private Date birthday;

    @Column(name = "telephone", columnDefinition = "varchar(12) COMMENT '手机号码'", nullable = false, unique = true)
    private String telephone;

    @Column(name = "email", columnDefinition = "varchar(255) COMMENT '邮箱'")
    private String email;

    @Column(name = "introduce", columnDefinition = "text COMMENT '简介'")
    private String introduce;

    @Column(name = "headPortrait", columnDefinition = "varchar(255) COMMENT '头像'")
    private String headPortrait;

    @Column(name = "age", columnDefinition = "varchar(3) COMMENT '年龄'")
    private String age;

    @Column(name = "work", columnDefinition = "varchar(255) COMMENT '职业'")
    private String work;

    @Column(name = "userState", columnDefinition = "bit(1) COMMENT '用户状态:0禁用、1正常'", nullable = false)
    private String userState;

}
