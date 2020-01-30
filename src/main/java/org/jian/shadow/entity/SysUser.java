package org.jian.shadow.entity;

import java.sql.Date;

/**
 * 系统用户表 - sys_user
 */
public class SysUser {

    public int id;

    public String username;

    public String password;

    public String phone;

    public String sex;

    public String email;

    public String mark;

    public String rank;

    public Date lastLogin;

    public String loginIp;

    public String imageUrl;

    public Date regTime;

    public int locked;
}
