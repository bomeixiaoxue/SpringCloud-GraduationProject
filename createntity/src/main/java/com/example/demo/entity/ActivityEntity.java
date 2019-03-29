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

    @Column(name = "coverPhoto", columnDefinition = "varchar(255) COMMENT '活动封面图片'")
    private String coverPhoto;

    @Column(name = "introduce", columnDefinition = "text COMMENT '发起者个人简介'")
    private String introduce;

    @Column(name = "startTime", columnDefinition = "datetime COMMENT '活动开始时间'", nullable = false)
    private String startTime;

    @Column(name = "endTime", columnDefinition = "datetime COMMENT '活动结束时间'", nullable = false)
    private String endTime;

    @Column(name = "addressID", columnDefinition = "varchar(32) COMMENT '活动地址ID'", nullable = false)
    private String addressID;

    @Column(name = "peopleNumber", columnDefinition = "int COMMENT '限制人数，最多50'", nullable = false)
    private int peopleNumber;

    @Column(name = "browseCount", columnDefinition = "int COMMENT '浏览量'")
    private int browseCount;

    @Column(name = "commentCount", columnDefinition = "int COMMENT '评论数'")
    private int commentCount;

    @Column(name = "dianZanCount", columnDefinition = "int COMMENT '点赞数'")
    private int dianZanCount;

}
