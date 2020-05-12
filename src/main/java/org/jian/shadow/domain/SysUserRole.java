package org.jian.shadow.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* 描述：sys_user_role模型
* @author tools
*/
@Table(name = "sys_user_role")
@Entity
public class SysUserRole{
	
    /*
     * 用户-角色关联ID
     */
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "user_role_id")
    private int userRoleId;
    /*
     * 用户ID
     */
	@Column(name = "user_id", insertable=false, updatable=false)
    private int userId;
    /*
     * 角色ID
     */
	@Column(name = "role_id", insertable=false, updatable=false)
    private int roleId;
	
	public int getUserRoleId() {
		return userRoleId;
	}
	public void setUserRoleId(int userRoleId) {
		this.userRoleId = userRoleId;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
}