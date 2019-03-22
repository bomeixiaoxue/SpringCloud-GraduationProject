package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author hao
 * @date 2019/3/22 12:18
 * description 评论实体
 */
@Data
@Entity(name = "c_comment")
public class CommentEntity extends BaseEntity{

    @Column(name = "userID", columnDefinition = "varchar(32) COMMENT '用户ID'", nullable = false)
    private String userID;

    @Column(name = "content", columnDefinition = "text COMMENT '评论内容'", nullable = false)
    private String content;

    @Column(name = "plly", columnDefinition = "int(2) COMMENT '评论来源：0新闻、1动态活动'", nullable = false)
    private String plly;

}
