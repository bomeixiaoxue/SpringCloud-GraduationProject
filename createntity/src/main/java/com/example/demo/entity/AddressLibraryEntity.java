package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author hao
 * @date 2019/3/22 10:21
 * description 地址库实体，省、市、区（县），保存在一个数据库
 */
@Data
@Entity(name = "a_addresslibrary")
public class AddressLibraryEntity extends BaseEntity{

    @Column(name = "name", columnDefinition = "varchar(50) COMMENT '类型名称'")
    private String name;

    @Column(name = "parentID", columnDefinition = "varchar(32) COMMENT '父级地址ID'")
    public String parentID;

    @Column(name = "type", columnDefinition = "int COMMENT '类型：1省、2市、3区（县）、4镇'")
    public String type;

}
