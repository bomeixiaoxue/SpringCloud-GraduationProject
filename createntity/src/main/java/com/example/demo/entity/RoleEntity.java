package com.example.demo.entity;


import lombok.Data;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Data
@Entity(name = "r_role")
public class RoleEntity extends BaseEntity implements GrantedAuthority {

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
