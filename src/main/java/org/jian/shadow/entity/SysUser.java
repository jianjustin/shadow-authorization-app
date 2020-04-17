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
public class SysUser extends Model<SysUser> {

    private static final long serialVersionUID = 1L;

    /**
     * 用户ID
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 用户登陆名
     */
    private String username;

    /**
     * 用户登陆密码
     */
    private String password;

    /**
     * 所属部门ID
     */
    private Integer departmentId;

    /**
     * 职位ID
     */
    private Integer postId;

    /**
     * 最后登陆时间
     */
    private LocalDate lastLogin;

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
    public Integer getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(Integer departmentId) {
        this.departmentId = departmentId;
    }
    public Integer getPostId() {
        return postId;
    }

    public void setPostId(Integer postId) {
        this.postId = postId;
    }
    public LocalDate getLastLogin() {
        return lastLogin;
    }

    public void setLastLogin(LocalDate lastLogin) {
        this.lastLogin = lastLogin;
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
        return "SysUser{" +
            "id=" + id +
            ", username=" + username +
            ", password=" + password +
            ", departmentId=" + departmentId +
            ", postId=" + postId +
            ", lastLogin=" + lastLogin +
            ", createDate=" + createDate +
            ", orderBy=" + orderBy +
        "}";
    }
}