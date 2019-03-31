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
 * @date 2019/3/22 10:28
 * description 用户群表
 */
@Data
@Entity(name = "u_userGroups")
public class UserGroupsEntity  {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "ID", length = 32, columnDefinition = "varchar(32) COMMENT '主键UUID'")
    public String ID;

    @Column(name = "groupsName", columnDefinition = "varchar(255) COMMENT '群名称'", nullable = false)
    private String groupsName;

    @Column(name = "adminID", columnDefinition = "varchar(32) COMMENT '群主ID'", nullable = false)
    private String adminID;

    @Column(name = "icon", columnDefinition = "varchar(255) COMMENT '群图标'")
    private String icon;

    @Column(name = "notice", columnDefinition = "varchar(255) COMMENT '群公告'")
    private String notice;

    @Column(name = "introduce", columnDefinition = "text COMMENT '群简介'")
    private String introduce;

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
}
