package com.example.demo.entity;

import lombok.Data;

import javax.persistence.Entity;

/**
 * @author hao
 * @date 2019/3/22 14:30
 * description 新闻类型实体
 */
@Data
@Entity(name = "n_news")
public class NewsTypeEntity extends BaseEntity{

}
