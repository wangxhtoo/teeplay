package org.teeplay.model.account;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OrderBy;
import javax.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;
import org.teeplay.model.IdEntity;

import com.google.common.collect.Lists;

@Entity
@Table(name="table_role")
public class Role extends IdEntity{

	private String roleName;
	private String roleDesc;
	private Date createDate;
	private Date updateDate;
	
	private List<Resource> resources = Lists.newArrayList();
	
	public String getRoleDesc() {
		return roleDesc;
	}
	public void setRoleDesc(String roleDesc) {
		this.roleDesc = roleDesc;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	@ManyToMany
	@JoinTable(name="table_role_resource",joinColumns={@JoinColumn(name="role_id")},inverseJoinColumns={@JoinColumn(name="resource_id")})
	// Fecth策略定义
	@Fetch(FetchMode.SUBSELECT)
	// 集合按id排序
//	@OrderBy("id asc")
	// 缓存策略
//	@Cache(usage=CacheConcurrencyStrategy.READ_WRITE)
	public List<Resource> getResources() {
		return resources;
	}
	public void setResources(List<Resource> resources) {
		this.resources = resources;
	}

}
