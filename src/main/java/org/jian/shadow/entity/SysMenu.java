package org.jian.shadow.entity;


import javax.persistence.*;

/**
 * 系统菜单表 - sys_menu
 */
@Table(name = "sys_menu")
@Entity
public class SysMenu {

    @Id
    @GeneratedValue
    @Column(name = "id")
    public int id;

    @Column(name = "parentId")
    public int parentId;

    @Column(name = "menuName")
    public String menuName;

    @Column(name = "menuIcon")
    public String menuIcon;

    @Column(name = "menuUrl")
    public String menuUrl;

    @Column(name = "menuType")
    public String menuType;

    @Column(name = "menuOrder")
    public String menuOrder;

    @Column(name = "menuStatus")
    public String menuStatus;
}
