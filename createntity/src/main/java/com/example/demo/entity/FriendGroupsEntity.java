package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author hao
 * @date 2019/3/22 9:49
 * description 好友分组实体
 */
@Data
@Entity(name = "f_firendGroups")
public class FriendGroupsEntity extends BaseEntity {

    @Column(name = "groupsID", columnDefinition = "varchar(32) COMMENT '分组ID'", nullable = false, unique = true)
    private String groupsID;

    @Column(name = "groupsName", columnDefinition = "varchar(255) COMMENT '分组名字'", nullable = false)
    private String groupsName;

    @Column(name = "userID", columnDefinition = "varchar(32) COMMENT '用户ID'", nullable = false)
    private String userID;

}
