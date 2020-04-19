package org.jian.shadow.domain;

/**
* 描述：sys_user_role模型
* @author tools
*/
public class SysUserRole{
	
    //用户-角色关联ID
    private int id;
    //用户ID
    private int userId;
    //角色ID
    private int roleId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
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