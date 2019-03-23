package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Transient;

/**
 * @author hao
 * @date 2019/3/22 14:29
 * description 新闻实体
 */
@Data
@Entity(name = "n_news")
public class NewsEntity extends BaseEntity {

    @Column(name = "newsTitle", columnDefinition = "varchar(255) COMMENT '新闻标题'", nullable = false)
    private String newsTitle;

    @Column(name = "newsContent", columnDefinition = "varchar(255) COMMENT '新闻内容'", nullable = false)
    private String newsContent;

    @Column(name = "newsTypeID", columnDefinition = "varchar(32) COMMENT '新闻类型ID'", nullable = false)
    private String newsTypeID;

    @Column(name = "authorID", columnDefinition = "varchar(32) COMMENT '新闻作者ID，为空时是第三方作者，只要作者名称authorName'")
    private String authorID;

    @Column(name = "browseCount", columnDefinition = "int COMMENT '浏览量'")
    private int browseCount;

    @Column(name = "commentCount", columnDefinition = "int COMMENT '评论数'")
    private int commentCount;

    @Column(name = "dianZanCount", columnDefinition = "int COMMENT '点赞数'")
    private int dianZanCount;


    @Transient
    private String authorName;

}
