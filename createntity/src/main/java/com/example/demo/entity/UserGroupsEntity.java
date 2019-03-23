package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author hao
 * @date 2019/3/22 10:28
 * description 用户群表
 */
@Data
@Entity(name = "u_userGroups")
public class UserGroupsEntity extends BaseEntity {

    @Column(name = "groupsName", columnDefinition = "varchar(255) COMMENT '群名称'", nullable = false)
    private String groupsName;

    @Column(name = "adminID", columnDefinition = "varchar(32) COMMENT '群主ID'", nullable = false)
    private String adminID;

    @Column(name = "icon", columnDefinition = "varchar(255) COMMENT '群图标'")
    private String icon;

    @Column(name = "notice", columnDefinition = "varchar(255) COMMENT '群公告'")
    private String notice;

    @Column(name = "introduce", columnDefinition = "text COMMENT '群简介'")
    private String introduce;

}
