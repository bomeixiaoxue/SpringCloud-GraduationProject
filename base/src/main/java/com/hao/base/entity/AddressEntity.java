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
 * @date 2019/3/22 12:38
 * description 地址实体
 */
@Data
@Entity(name = "a_address")
public class AddressEntity  {

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
