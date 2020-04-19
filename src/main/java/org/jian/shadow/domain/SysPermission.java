package org.jian.shadow.domain;
import java.util.Date;

/**
* 描述：sys_permission模型
* @author tools
*/
public class SysPermission{
	
    //权限ID
    private int id;
    //资源ID
    private int resourceId;
    //角色ID
    private int roleId;
    //权限状态
    private int permissionStatus;
    //记录创建时间
    private Date createDate;
    //排序号
    private int orderBy;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getResourceId() {
		return resourceId;
	}
	public void setResourceId(int resourceId) {
		this.resourceId = resourceId;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public int getPermissionStatus() {
		return permissionStatus;
	}
	public void setPermissionStatus(int permissionStatus) {
		this.permissionStatus = permissionStatus;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(int orderBy) {
		this.orderBy = orderBy;
	}

    
}