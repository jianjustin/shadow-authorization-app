package org.jian.shadow.mapper;

import org.apache.ibatis.annotations.*;
import org.jian.shadow.entity.SysMenu;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "sysMenuMapper")
public interface SysMenuMapper {
    /**
     * 查询所有系统菜单
     * @return
     */
    @Select("SELECT * FROM sys_menu")
    @Results({
            @Result(property = "id",  column = "id"),
            @Result(property = "parentId",  column = "parentId"),
            @Result(property = "menuName",  column = "menuName"),
            @Result(property = "menuIcon",  column = "menuIcon"),
            @Result(property = "menuUrl",  column = "menuUrl"),
            @Result(property = "menuType",  column = "menuType"),
            @Result(property = "menuOrder",  column = "menuOrder"),
            @Result(property = "menuStatus",  column = "menuStatus")
    })
    List<SysMenu> findAll();

    /**
     * 根据指定系统菜单
     * @param id
     * @return
     */
    @Select("SELECT id,parentId,menuName,menuIcon,menuUrl,menuType,menuOrder,menuStatus FROM sys_menu WHERE id = #{id}")
    @Results({
            @Result(property = "id",  column = "id"),
            @Result(property = "parentId",  column = "parentId"),
            @Result(property = "menuName",  column = "menuName"),
            @Result(property = "menuIcon",  column = "menuIcon"),
            @Result(property = "menuUrl",  column = "menuUrl"),
            @Result(property = "menuType",  column = "menuType"),
            @Result(property = "menuOrder",  column = "menuOrder"),
            @Result(property = "menuStatus",  column = "menuStatus")
    })
    SysMenu findOne(int id);

    /**
     * 插入系统菜单
     * @param sysMenu
     */
    @Insert("INSERT INTO sys_menu(parentId,menuName,menuIcon,menuUrl,menuType,menuOrder,menuStatus) VALUES(#{parentId},#{menuName},#{menuIcon},#{menuUrl},#{menuType},#{menuOrder},#{menuStatus})")
    void insert(SysMenu sysMenu);

    /**
     * 更新系统菜单信息
     * @param sysMenu
     */
    @Update("UPDATE sys_menu SET parentId=#{parentId},menuName=#{menuName},menuIcon=#{menuIcon},menuUrl=#{menuUrl},menuType=#{menuType},menuOrder=#{menuOrder},menuStatus=#{menuStatus}")
    void update(SysMenu sysMenu);

    /**
     * 删除系统菜单
     * @param id
     */
    @Delete("DELETE FROM sys_menu WHERE id =#{id}")
    void delete(int id);
}
