package org.jian.shadow.domain;
import java.time.LocalDate;
import java.util.Date;

/**
* 描述：sys_role模型
* @author tools
*/
public class SysRole{
	
    //角色ID
    private int id;
    //角色名称
    private String roleName;
    //角色类型
    private int roleType;
    //记录创建时间
    private LocalDate createDate;
    //排序号
    private int orderBy;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public int getRoleType() {
		return roleType;
	}
	public void setRoleType(int roleType) {
		this.roleType = roleType;
	}
	public LocalDate getCreateDate() {
		return createDate;
	}
	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	public int getOrderBy() {
		return orderBy;
	}
	public void setOrderBy(int orderBy) {
		this.orderBy = orderBy;
	}

    
}