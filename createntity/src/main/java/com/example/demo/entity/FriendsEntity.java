package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author hao
 * @date 2019/3/22 9:49
 * description 好友实体
 */
@Data
@Entity(name = "f_firends")
public class FriendsEntity extends BaseEntity {

    @Column(name = "userID", columnDefinition = "varchar(32) COMMENT '自己的id'", nullable = false)
    private String userID;

    @Column(name = "firendID", columnDefinition = "varchar(32) COMMENT '好友id'", nullable = false)
    private String firendID;

    @Column(name = "friendTypeID", columnDefinition = "varchar(32) COMMENT '好友类型id'", nullable = false)
    private String friendTypeID;

    @Column(name = "friendGroupsID", columnDefinition = "varchar(32) COMMENT '好友分组id'")
    private String friendGroupsID;

    @Column(name = "firendName", columnDefinition = "varchar(255) COMMENT '好友备注昵称'", nullable = false)
    private String firendName;

}
