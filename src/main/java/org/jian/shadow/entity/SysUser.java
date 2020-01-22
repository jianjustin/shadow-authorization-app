package org.jian.shadow.entity;

import javax.persistence.*;
import java.sql.Date;

/**
 * 系统用户表 - sys_user
 */
@Table(name = "sys_user")
@Entity
public class SysUser {
    @Id
    @GeneratedValue
    @Column(name = "id")
    public int id;

    @Column(name = "username")
    public String username;

    @Column(name = "password")
    public String password;

    @Column(name = "phone")
    public String phone;

    @Column(name = "sex")
    public String sex;

    @Column(name = "email")
    public String email;

    @Column(name = "mark")
    public String mark;

    @Column(name = "rank")
    public String rank;

    @Column(name = "lastLogin")
    public Date lastLogin;

    @Column(name = "loginIp")
    public String loginIp;

    @Column(name = "imageUrl")
    public String imageUrl;

    @Column(name = "regTime")
    public Date regTime;

    @Column(name = "locked")
    public int locked;
}
