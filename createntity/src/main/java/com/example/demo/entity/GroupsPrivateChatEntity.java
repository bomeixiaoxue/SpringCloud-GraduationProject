package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author hao
 * @date 2019/3/22 12:06
 * description 群内私聊消息关联实体
 */
@Data
@Entity(name = "g_groupsPrivateChat")
public class GroupsPrivateChatEntity extends BaseEntity{


    @Column(name = "messagesType", columnDefinition = "varchar(50) COMMENT '类型名称'", nullable = false, unique = true)
    private String messagesType;

    @Column(name = "sendUserID", columnDefinition = "varchar(32) COMMENT '发送者ID'", nullable = false)
    private String sendUserID;

    @Column(name = "sendUserNickName", columnDefinition = "varchar(255) COMMENT '发送者昵称'", nullable = false)
    private String sendUserNickName;

    @Column(name = "receiveUserID", columnDefinition = "varchar(32) COMMENT '接收者ID'", nullable = false)
    private String receiveUserID;

    @Column(name = "messagesData", columnDefinition = "text COMMENT '消息内容'", nullable = false)
    private String messagesData;

    @Column(name = "status", columnDefinition = "bit(1) COMMENT '接收状态'", nullable = false)
    private String status;

    @Column(name = "userGroupID", columnDefinition = "varchar(32) COMMENT '所属群ID'", nullable = false)
    private String userGroupID;

}
