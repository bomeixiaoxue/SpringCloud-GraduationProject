package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;

/**
 * @author hao
 * @date 2019/3/22 12:38
 * description 地址实体
 */
@Data
@Entity(name = "a_address")
public class AddressEntity extends BaseEntity {

    @Column(name = "province", columnDefinition = "varchar(10) COMMENT '省编号'", nullable = false)
    private String province;

    @Column(name = "city", columnDefinition = "varchar(20) COMMENT '市编号'", nullable = false)
    private String city;

    @Column(name = "county", columnDefinition = "varchar(50) COMMENT '区（县）编号'")
    private String county;

    @Column(name = "town", columnDefinition = "varchar(50) COMMENT '镇编号'")
    private String town;

    @Column(name = "longitude", columnDefinition = "double COMMENT '经度'")
    private double longitude;

    @Column(name = "latitude", columnDefinition = "double COMMENT '经度'")
    private double latitude;

    @Column(name = "iconPath", columnDefinition = "varchar(255) COMMENT '地图地点图标'")
    private String iconPath;

}
