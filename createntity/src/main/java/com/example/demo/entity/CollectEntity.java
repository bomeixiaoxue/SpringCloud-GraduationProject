package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author hao
 * @date 2019/3/22 12:25
 * description 收藏实体
 */
@Data
@Entity(name = "c_collect")
public class CollectEntity extends BaseEntity {

    @Column(name = "userID", columnDefinition = "varchar(32) COMMENT '用户ID'", nullable = false)
    private String userID;

    @Column(name = "sclyID", columnDefinition = "varchar(32) COMMENT '收藏来源ID，新闻ID，活动ID'", nullable = false)
    private String sclyID;

    @Column(name = "scly", columnDefinition = "int(2) COMMENT '收藏来源：0新闻、1动态活动'", nullable = false)
    private String scly;

}
