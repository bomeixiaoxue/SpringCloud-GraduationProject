package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author hao
 * @date 2019/3/22 11:10
 * description 群用户关联表
 */
@Data
@Entity(name = "g_groupsToUser")
public class GroupsToUserEntity extends BaseEntity{


    @Column(name = "userID", columnDefinition = "varchar(32) COMMENT '群用户ID'", nullable = false)
    private String userID;

    @Column(name = "groupID", columnDefinition = "varchar(32) COMMENT '群ID'", nullable = false)
    private String groupID;

    @Column(name = "groupNick", columnDefinition = "varchar(255) COMMENT '群内用户昵称'")
    private String groupNick;

}
