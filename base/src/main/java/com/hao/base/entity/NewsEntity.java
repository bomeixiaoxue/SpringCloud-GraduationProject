package com.hao.base.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

/**
 * @author hao
 * @date 2019/3/22 14:29
 * description 新闻实体
 */
@Data
@Entity(name = "n_news")
public class NewsEntity  {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "ID", length = 32, columnDefinition = "varchar(32) COMMENT '主键UUID'")
    public String ID;

    @Column(name = "newsTitle", columnDefinition = "varchar(255) COMMENT '新闻标题'", nullable = false)
    private String newsTitle;

    @Column(name = "newsContent", columnDefinition = "varchar(255) COMMENT '新闻内容'", nullable = false)
    private String newsContent;

    @Column(name = "newsTypeID", columnDefinition = "varchar(32) COMMENT '新闻类型ID'", nullable = false)
    private String newsTypeID;

    @Column(name = "authorID", columnDefinition = "varchar(32) COMMENT '新闻作者ID，为空时是第三方作者，只要作者名称authorName'")
    private String authorID;

    @Column(name = "browseCount", columnDefinition = "int COMMENT '浏览量'")
    private int browseCount;

    @Column(name = "commentCount", columnDefinition = "int COMMENT '评论数'")
    private int commentCount;

    @Column(name = "dianZanCount", columnDefinition = "int COMMENT '点赞数'")
    private int dianZanCount;

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

    @Transient
    private String authorName;

}
