package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author hao
 * @date 2019/3/22 11:20
 * description 群消息内容实体
 */
@Data
@Entity(name = "g_groupsContent")
public class GroupsContentEntity extends BaseEntity{

    @Column(name = "content", columnDefinition = "text COMMENT '消息内容'", nullable = false, unique = true)
    private String sendContent;

    @Column(name = "senderID", columnDefinition = "varchar(50) COMMENT '发送者ID'", nullable = false, unique = true)
    private String sendID;

    @Column(name = "senderNickName", columnDefinition = "varchar(50) COMMENT '发送者昵称'", nullable = false, unique = true)
    private String sendNickName;

}
