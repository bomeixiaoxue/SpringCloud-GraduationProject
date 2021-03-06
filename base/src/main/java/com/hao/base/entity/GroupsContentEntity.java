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
 * @date 2019/3/22 11:20
 * description 群消息内容实体
 */
@Data
@Entity(name = "g_groupsContent")
public class GroupsContentEntity {

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

    @Column(name = "content", columnDefinition = "text COMMENT '消息内容'", nullable = false, unique = true)
    private String sendContent;

    @Column(name = "senderID", columnDefinition = "varchar(50) COMMENT '发送者ID'", nullable = false, unique = true)
    private String sendID;

    @Column(name = "senderNickName", columnDefinition = "varchar(50) COMMENT '发送者昵称'", nullable = false, unique = true)
    private String sendNickName;

}
