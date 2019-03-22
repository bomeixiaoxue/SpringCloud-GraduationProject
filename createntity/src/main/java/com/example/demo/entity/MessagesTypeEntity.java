package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author hao
 * @date 2019/3/22 10:13
 * description 消息类型实体
 */
@Data
@Entity(name = "m_messagestype")
public class MessagesTypeEntity extends BaseEntity{

    @Column(name = "messagesType", columnDefinition = "varchar(50) COMMENT '类型名称'", nullable = false, unique = true)
    private String messagesType;

}
