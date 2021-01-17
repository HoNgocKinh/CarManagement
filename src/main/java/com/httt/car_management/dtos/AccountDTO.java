package com.httt.car_management.dtos;

import com.httt.car_management.common.BaseDTO;

public class AccountDTO extends BaseDTO {
	
	private static final long serialVersionUID = 1L;
	
	private String username;
	
	private String roles;
	
	private String permissions;
	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getRoles() {
		return roles;
	}

	public void setRoles(String roles) {
		this.roles = roles;
	}

	public String getPermissions() {
		return permissions;
	}

	public void setPermissions(String permissions) {
		this.permissions = permissions;
	}
}
