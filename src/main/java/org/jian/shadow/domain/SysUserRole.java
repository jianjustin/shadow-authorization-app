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
	@Column(name = "user_role_id")
    private String userRoleId;
    /*
     * 用户ID
     */
	@Column(name = "user_id", insertable=false, updatable=false)
    private String userId;
    /*
     * 角色ID
     */
	@Column(name = "role_id", insertable=false, updatable=false)
    private String roleId;

	public String getUserRoleId() {
		return userRoleId;
	}

	public void setUserRoleId(String userRoleId) {
		this.userRoleId = userRoleId;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}
}