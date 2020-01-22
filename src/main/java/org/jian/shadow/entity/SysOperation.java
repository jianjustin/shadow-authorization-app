package org.jian.shadow.entity;

import javax.persistence.*;

/**
 * 系统API表 - sys_operation
 */
@Table(name = "sys_operation")
@Entity
public class SysOperation {

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int id;
    @Column(name = "name")
    public String name;
    @Column(name = "api")
    public String api;
    @Column(name = "url")
    public String url;

}
