package org.teeplay.model.account;

import java.util.Date;

public class TeeUser {
	
	public enum User {
		
		id,
		username,
		password,
		mail,
		createdate

	}
	
	private long id;
	
	private String name;
	
	private String password;
	
	private String email;
	
	private String status;
	
	private Date createTime;
	
	private Date updateTime;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	@Override
	public String toString() {
		return "TeeUser [id=" + id + ", name=" + name + ", password="
				+ password + ", email=" + email + ", status=" + status
				+ ", createTime=" + createTime + ", updateTime=" + updateTime
				+ "]";
	}
	
}
