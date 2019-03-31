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
 * @date 2019/3/22 12:18
 * description 评论实体
 */
@Data
@Entity(name = "c_comment")
public class CommentEntity {

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

    @Column(name = "targetID", columnDefinition = "varchar(32) COMMENT '评论对象ID：新闻、动态活动'", nullable = false)
    private String targetID;

    @Column(name = "userID", columnDefinition = "varchar(32) COMMENT '评论用户ID'", nullable = false)
    private String userID;

    @Column(name = "content", columnDefinition = "text COMMENT '评论内容'", nullable = false)
    private String content;

    @Column(name = "plly", columnDefinition = "int(2) COMMENT '评论来源：0新闻、1动态活动'", nullable = false)
    private String plly;

}
