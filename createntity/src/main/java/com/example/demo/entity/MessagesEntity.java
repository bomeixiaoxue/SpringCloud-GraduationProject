package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author hao
 * @date 2019/3/22 10:06
 * description 聊天记录表
 */
@Data
@Entity(name = "m_messages")
public class MessagesEntity  extends BaseEntity{

    @Column(name = "messagesData", columnDefinition = "text COMMENT '消息内容'", nullable = false)
    private String messagesData;

    @Column(name = "status", columnDefinition = "bit(1) COMMENT '接收状态'", nullable = false)
    private String status;

    @Column(name = "messagesTypeID", columnDefinition = "varchar(32) COMMENT '消息类型ID'", nullable = false)
    private String messagesTypeID;

    @Column(name = "sendUserID", columnDefinition = "varchar(32) COMMENT '发送者ID'", nullable = false)
    private String sendUserID;

    @Column(name = "receiveUserID", columnDefinition = "varchar(32) COMMENT '接收者ID'", nullable = false)
    private String receiveUserID;

}
