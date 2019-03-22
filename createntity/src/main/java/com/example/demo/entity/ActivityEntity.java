package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author hao
 * @date 2019/3/22 12:31
 * description 动态活动实体
 */
@Data
@Entity(name = "a_activity")
public class ActivityEntity extends BaseEntity{

    @Column(name = "activityName", columnDefinition = "varchar(255) COMMENT '活动名称'", nullable = false)
    private String activityName;

    @Column(name = "activityContent", columnDefinition = "text COMMENT '活动内容'", nullable = false)
    private String activityContent;

    @Column(name = "addressID", columnDefinition = "varchar(32) COMMENT '活动地址ID'", nullable = false)
    private String addressID;

}
