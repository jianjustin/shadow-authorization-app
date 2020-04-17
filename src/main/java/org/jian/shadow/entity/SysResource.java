package org.jian.shadow.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import java.time.LocalDate;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author jian
 * @since 2020-04-17
 */
public class SysResource extends Model<SysResource> {

    private static final long serialVersionUID = 1L;

    /**
     * 角色ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 资源名称
     */
    private String resourceName;

    /**
     * 资源路径
     */
    private String resourceUrl;

    /**
     * 资源操作
     */
    private String resourceOperation;

    /**
     * 资源类型
     */
    private Integer resourceType;

    /**
     * 记录创建时间
     */
    private LocalDate createDate;

    /**
     * 排序号
     */
    private Integer orderBy;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
    public Integer getResourceType() {
        return resourceType;
    }

    public void setResourceType(Integer resourceType) {
        this.resourceType = resourceType;
    }
    public LocalDate getCreateDate() {
        return createDate;
    }

    public void setCreateDate(LocalDate createDate) {
        this.createDate = createDate;
    }
    public Integer getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(Integer orderBy) {
        this.orderBy = orderBy;
    }

    @Override
    protected Serializable pkVal() {
        return this.id;
    }

    @Override
    public String toString() {
        return "SysResource{" +
            "id=" + id +
            ", resourceName=" + resourceName +
            ", resourceUrl=" + resourceUrl +
            ", resourceOperation=" + resourceOperation +
            ", resourceType=" + resourceType +
            ", createDate=" + createDate +
            ", orderBy=" + orderBy +
        "}";
    }
}