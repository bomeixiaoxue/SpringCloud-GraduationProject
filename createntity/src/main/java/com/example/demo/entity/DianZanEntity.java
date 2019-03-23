package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author hao
 * @date 2019/3/24 0:29
 * description 点赞实体
 */
@Data
@Entity(name = "d_dianZan")
public class DianZanEntity extends BaseEntity {

    @Column(name = "targetID", columnDefinition = "varchar(32) COMMENT '点赞对象ID：新闻、动态活动'", nullable = false)
    private String targetID;

    @Column(name = "userID", columnDefinition = "varchar(32) COMMENT '点赞用户ID'", nullable = false)
    private String userID;

    @Column(name = "dzly", columnDefinition = "int(2) COMMENT '点赞来源：0新闻、1动态活动'", nullable = false)
    private String dzly;

}
