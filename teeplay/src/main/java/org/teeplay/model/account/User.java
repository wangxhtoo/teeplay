package org.teeplay.model.account;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;
import org.teeplay.model.IdEntity;
import org.teeplay.util.Collections3;

import com.google.common.collect.Lists;

@Entity
@Table(name="table_user")
//默认的缓存策略.
//@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
public class User extends IdEntity{
	
	private String userName;
	private String loginName;
	private String password;
	private String email;
	private String status;
	private Date createTime;
	private Date updateTime;
	
	private List<Role> roleList = Lists.newArrayList(); // 有序的关联对象集合，用户拥有的角色
	
	private List<Resource> resources = Lists.newArrayList(); //用户拥有的资源
	
	@NotBlank
	@Column(name="user_name")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	@Transient
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Email
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
	public String getLoginName() {
		return loginName;
	}
	public void setLoginName(String loginName) {
		this.loginName = loginName;
	}
	
	@ManyToMany
	@JoinTable(name="table_user_role",joinColumns={@JoinColumn(name="user_id")},inverseJoinColumns={@JoinColumn(name="role_id")})
	// Fecth策略定义
	@Fetch(FetchMode.SUBSELECT)
	// 集合按id排序
//	@OrderBy("id asc")
	// 缓存策略
//	@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
	public List<Role> getRoleList() {
		return roleList;
	}
	public void setRoleList(List<Role> roleList) {
		this.roleList = roleList;
	}

	@Transient
	public String getRoleNames(){
		return Collections3.extractToString(roleList, "role_name", ",");
	}

	@ManyToMany
	@JoinTable(name="table_user_resource",joinColumns={@JoinColumn(name="user_id")},inverseJoinColumns={@JoinColumn(name="resource_id")})
	@Fetch(FetchMode.SUBSELECT)
//	@OrderBy("id asc")
//	@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
	public List<Resource> getResources() {
		return resources;
	}
	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}
	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this);
	}
}
