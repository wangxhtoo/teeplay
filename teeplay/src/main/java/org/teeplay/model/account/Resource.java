package org.teeplay.model.account;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

import org.teeplay.model.IdEntity;

@Entity
@Table(name="table_resource")
public class Resource extends IdEntity{
	
	private long resourceId;
	private String resourceName;
	private String resourcePermission;
	private String resourceDesc;
	private long parentId;
	private Date createDate;
	private Date updateDate;
	
	public long getResourceId() {
		return resourceId;
	}
	public void setResourceId(long resourceId) {
		this.resourceId = resourceId;
	}
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public long getParentId() {
		return parentId;
	}
	public void setParentId(long parentId) {
		this.parentId = parentId;
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
	public String getResourcePermission() {
		return resourcePermission;
	}
	public void setResourcePermission(String resourcePermission) {
		this.resourcePermission = resourcePermission;
	}
	public String getResourceDesc() {
		return resourceDesc;
	}
	public void setResourceDesc(String resourceDesc) {
		this.resourceDesc = resourceDesc;
	}
}
