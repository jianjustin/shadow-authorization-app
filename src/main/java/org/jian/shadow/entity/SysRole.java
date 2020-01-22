package org.jian.shadow.entity;

import javax.persistence.*;

/**
 * 系统角色表 - sys_role
 */
@Table(name = "sys_role")
@Entity
public class SysRole {

    @Id
    @GeneratedValue
    @Column(name = "roleId")
    public int roleId;
    @Column(name = "roleName")
    public String roleName;
    @Column(name = "roleDesc")
    public String roleDesc;
    @Column(name = "role")
    public String role;

}
