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
 * @date 2019/3/24 0:29
 * description 点赞实体
 */
@Data
@Entity(name = "d_dianZan")
public class DianZanEntity  {

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

    @Column(name = "targetID", columnDefinition = "varchar(32) COMMENT '点赞对象ID：新闻、动态活动'", nullable = false)
    private String targetID;

    @Column(name = "userID", columnDefinition = "varchar(32) COMMENT '点赞用户ID'", nullable = false)
    private String userID;

    @Column(name = "dzly", columnDefinition = "int(2) COMMENT '点赞来源：0新闻、1动态活动'", nullable = false)
    private String dzly;

}
