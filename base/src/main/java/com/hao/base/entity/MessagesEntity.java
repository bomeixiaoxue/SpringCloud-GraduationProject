package com.hao.base.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

/**
 * @author hao
 * @date 2019/3/22 10:06
 * description 聊天记录表
 */
@Data
@Entity(name = "m_messages")
public class MessagesEntity  {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "ID", length = 32, columnDefinition = "varchar(32) COMMENT '主键UUID'")
    public String ID;

    @CreationTimestamp
    @Column(name = "creatTime", columnDefinition = "datetime COMMENT '创建时间'")
    public Date creatTime;

    @UpdateTimestamp
    @Column(name = "updateTime", columnDefinition = "datetime COMMENT '修改时间'")
    public Date updateTime;

    @Column(name = "yxbz", columnDefinition = "bit(1) COMMENT '有效标志：0正常、1无效'")
    public String yxbz;

    @Column(name = "bz", columnDefinition = "varchar(255) COMMENT '备注'")
    public String bz;

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
