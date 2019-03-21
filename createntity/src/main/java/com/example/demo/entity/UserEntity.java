package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * User: hao
 * Date: 2019/3/21
 * Time: 23:42
 * Description: 用户信息实体
 */
@Data
@Entity(name = "user")
public class UserEntity {

    @Id
    @Column(columnDefinition = "bigint COMMENT '自增id'")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "varchar(255) COMMENT '用户名'", nullable = false, unique = true)
    private String username;

    @Column(columnDefinition = "varchar(32) COMMENT '登陆账号'", nullable = false, unique = true)
    private String loginid;

    @Column(columnDefinition = "varchar(255) COMMENT '密码'", nullable = false)
    private String password;

    @Column(columnDefinition = "varchar(255) COMMENT '个性签名'", nullable = false)
    private String signature;

    @Column(columnDefinition = "bit(1) COMMENT '性别:0女、1男'", nullable = false)
    private String sex;

    @Column(columnDefinition = "date COMMENT '生日'", nullable = false)
    private String birthday;

    @Column(columnDefinition = "varchar(12) COMMENT '手机号码'", nullable = false, unique = true)
    private String telephone;

    @Column(columnDefinition = "varchar(255) COMMENT '真实姓名'")
    private String realname;

    @Column(columnDefinition = "varchar(255) COMMENT '邮箱'")
    private String email;

    @Column(columnDefinition = "text COMMENT '简介'")
    private String introduce;

    @Column(columnDefinition = "varchar(255) COMMENT '头像'")
    private String headportrait;

    @Column(columnDefinition = "varchar(3) COMMENT '年龄'")
    private String age;

    @Column(columnDefinition = "varchar(255) COMMENT '职业'")
    private String work;

    @Column(columnDefinition = "bit(1) COMMENT '用户状态:0禁用、1正常'", nullable = false)
    private String userstate;

}
