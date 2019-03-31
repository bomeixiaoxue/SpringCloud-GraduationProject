package com.hao.base.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

/**
 * @author hao
 * @date 2019/3/22 9:49
 * description 用户信息实体
 */

@Data
@Entity(name = "u_user")
public class UserEntity implements UserDetails, Serializable {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid")
    @Column(name = "ID", length = 32, columnDefinition = "varchar(32) COMMENT '主键UUID'")
    public String ID;

    @Column(name = "username", columnDefinition = "varchar(32) COMMENT '登陆账号'", nullable = false, unique = true)
    private String username;

    @Column(name = "password", columnDefinition = "varchar(255) COMMENT '登陆密码'", nullable = false)
    private String password;

    @Column(name = "realName", columnDefinition = "varchar(255) COMMENT '真实姓名'", nullable = false)
    private String realName;

    @Column(name = "nickName", columnDefinition = "varchar(255) COMMENT '昵称'", nullable = false)
    private String nickName;

    @Column(name = "signature", columnDefinition = "varchar(255) COMMENT '个性签名'")
    private String signature;

    @Column(name = "sex", columnDefinition = "bit(1) COMMENT '性别:0女、1男'", nullable = false)
    private String sex;

    @Column(name = "birthday", columnDefinition = "datetime COMMENT '生日'", nullable = false)
    private Date birthday;

    @Column(name = "telephone", columnDefinition = "varchar(12) COMMENT '手机号码'", nullable = false, unique = true)
    private String telephone;

    @Column(name = "email", columnDefinition = "varchar(255) COMMENT '邮箱'")
    private String email;

    @Column(name = "introduce", columnDefinition = "text COMMENT '简介'")
    private String introduce;

    @Column(name = "headPortrait", columnDefinition = "varchar(255) COMMENT '头像'")
    private String headPortrait;

    @Column(name = "age", columnDefinition = "varchar(3) COMMENT '年龄'")
    private String age;

    @Column(name = "work", columnDefinition = "varchar(255) COMMENT '职业'")
    private String work;

    @Column(name = "userState", columnDefinition = "bit(1) COMMENT '用户状态:0禁用、1正常'", nullable = false)
    private String userState;

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

    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinTable(name = "user_role", joinColumns = @JoinColumn(name = "user_id", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "role_id", referencedColumnName = "id"))
    private List<RoleEntity> authorities;

    @Override
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<RoleEntity> authorities) {
        this.authorities = authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

}
