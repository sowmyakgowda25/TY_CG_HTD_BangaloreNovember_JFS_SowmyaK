package com.capgemini.fms_jdbc.bean;

import java.io.Serializable;

@SuppressWarnings("serial")
public class LoginBean implements Serializable {
	
	private int id;
	private String adminName;
	private String password;
	private String type;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "LoginBean [id=" + id + ", adminName=" + adminName + ", password=" + password + ", type=" + type + "]";
	}
}
