package com.hao.ssoservice.sso.entity;


import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Data
@Entity(name = "r_role")
public class RoleEntity  implements GrantedAuthority {

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

	@Column(nullable = false)
	private String name;

	@Override
	public String getAuthority() {
		return name;
	}

	@Override
	public String toString() {
		return name;
	}
}
