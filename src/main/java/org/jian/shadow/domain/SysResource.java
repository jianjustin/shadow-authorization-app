package org.jian.shadow.domain;
import java.util.Date;

/**
* 描述：sys_resource模型
* @author tools
*/
public class SysResource{
	
    //角色ID
    private int id;
    //资源名称
    private String resourceName;
    //资源路径
    private String resourceUrl;
    //资源操作
    private String resourceOperation;
    //资源类型
    private int resourceType;
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
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public String getResourceUrl() {
		return resourceUrl;
	}
	public void setResourceUrl(String resourceUrl) {
		this.resourceUrl = resourceUrl;
	}
	public String getResourceOperation() {
		return resourceOperation;
	}
	public void setResourceOperation(String resourceOperation) {
		this.resourceOperation = resourceOperation;
	}
	public int getResourceType() {
		return resourceType;
	}
	public void setResourceType(int resourceType) {
		this.resourceType = resourceType;
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