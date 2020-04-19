package org.jian.shadow.domain;
import java.util.Date;

/**
* 描述：sys_user模型
* @author tools
*/
public class SysUser{
	
    //用户ID
    private int id;
    //用户登陆名
    private String username;
    //用户登陆密码
    private String password;
    //所属部门ID
    private int departmentId;
    //职位ID
    private int postId;
    //最后登陆时间
    private Date lastLogin;
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
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
	}
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public Date getLastLogin() {
		return lastLogin;
	}
	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
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