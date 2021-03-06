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
 * @date 2019/3/22 10:21
 * description 地址库实体，省、市、区（县），保存在一个数据库
 */
@Data
@Entity(name = "a_addressLibrary")
public class AddressLibraryEntity {

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

    @Column(name = "name", columnDefinition = "varchar(50) COMMENT '类型名称'")
    private String name;

    @Column(name = "parentID", columnDefinition = "varchar(32) COMMENT '父级地址ID'")
    public String parentID;

    @Column(name = "type", columnDefinition = "int COMMENT '类型：1省、2市、3区（县）、4镇'")
    public String type;

}
