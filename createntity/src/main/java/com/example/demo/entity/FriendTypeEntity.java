package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * @author hao
 * @date 2019/3/22 9:49
 * description 好友类型实体
 */
@Data
@Entity(name = "f_friendtype")
public class FriendTypeEntity extends BaseEntity {

    @Column(name = "friendType", columnDefinition = "varchar(32) COMMENT '好友类型'", nullable = false, unique = true)
    private String friendType;

}
