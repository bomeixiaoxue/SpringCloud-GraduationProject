package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

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

    @Column(name = "authorID", columnDefinition = "varchar(32) COMMENT '新闻作者ID'", nullable = false)
    private String authorID;

}
