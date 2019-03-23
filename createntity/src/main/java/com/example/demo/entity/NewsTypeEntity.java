package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author hao
 * @date 2019/3/22 14:30
 * description 新闻类型实体
 */
@Data
@Entity(name = "n_newsType")
public class NewsTypeEntity extends BaseEntity{

    @Column(name = "newsTypeBH", columnDefinition = "varchar(255) COMMENT '新闻类型编号'", nullable = false, unique = true)
    private int newsTypeBH;

    @Column(name = "newsTypeName", columnDefinition = "varchar(255) COMMENT '新闻类型名称'", nullable = false)
    private String newsTypeName;

}
