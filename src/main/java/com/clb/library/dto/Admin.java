package com.clb.library.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Admin {
	@Id
	@Column(name = "admin_id")
	private int adminId;
	@Column(name = "admin_name")
	private String username;
	@Column(name = "admin_password")
	private String password;
	@Column(name = "admin_role")
	private String Role;

}
