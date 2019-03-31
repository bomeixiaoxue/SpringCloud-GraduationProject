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
 * @date 2019/3/22 9:49
 * description 好友实体
 */
@Data
@Entity(name = "f_firends")
public class FriendsEntity  {

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

    @Column(name = "userID", columnDefinition = "varchar(32) COMMENT '用户的id'", nullable = false)
    private String userID;

    @Column(name = "firendID", columnDefinition = "varchar(32) COMMENT '好友id'", nullable = false)
    private String firendID;

    @Column(name = "friendTypeID", columnDefinition = "varchar(32) COMMENT '好友类型id'", nullable = false)
    private String friendTypeID;

    @Column(name = "friendGroupsID", columnDefinition = "varchar(32) COMMENT '好友分组id'")
    private String friendGroupsID;

    @Column(name = "firendName", columnDefinition = "varchar(255) COMMENT '好友备注昵称'", nullable = false)
    private String firendName;

}
