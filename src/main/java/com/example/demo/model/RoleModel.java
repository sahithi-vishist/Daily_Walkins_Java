package com.example.demo.model;

import javax.persistence.*;

import lombok.Data;

@Entity(name="role")
@Data
public class RoleModel {
	
	@Id
	@Column(name="roleid")
	private int roleId;
	
	@OneToOne
	@JoinColumn(name="industryid")
	private IndustriesModel industryId;
	
	@Column(name="rolename")
	private String roleName;
	
	
	@Column(name="subrolename")
	private String subRoleName;
	
	@Column(name="rolecount")
	private int roleCount;


}
