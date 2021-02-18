package org.jian.shadow.domain;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* 描述：sys_permission模型
* @author tools
*/
@Table(name = "sys_permission")
@Entity
public class SysPermission{
	
    /*
     * 权限ID
     */
	@Id
	@Column(name = "permission_id")
    private String permissionId;
    /*
     * 资源ID
     */
	@Column(name = "resource_id", insertable=false, updatable=false)
    private String resourceId;
    /*
     * 角色ID
     */
	@Column(name = "role_id", insertable=false, updatable=false)
    private String roleId;
    /*
     * 权限状态
     */
	@Column(name = "permission_status")
    private int permissionStatus;
    /*
     * 记录创建时间
     */
	@Column(name = "create_date")
    private Timestamp createDate;
    /*
     * 排序号
     */
	@Column(name = "order_by")
    private int orderBy;

	public String getPermissionId() {
		return permissionId;
	}

	public void setPermissionId(String permissionId) {
		this.permissionId = permissionId;
	}

	public String getResourceId() {
		return resourceId;
	}

	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public int getPermissionStatus() {
		return permissionStatus;
	}
	public void setPermissionStatus(int permissionStatus) {
		this.permissionStatus = permissionStatus;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public int getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(int orderBy) {
		this.orderBy = orderBy;
	}
}