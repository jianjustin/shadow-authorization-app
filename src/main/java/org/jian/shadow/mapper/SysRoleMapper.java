package org.jian.shadow.mapper;

import org.apache.ibatis.annotations.*;
import org.jian.shadow.entity.SysRole;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "sysRoleMapper")
public interface SysRoleMapper {

    /**
     * 查询所以系统用户
     * @return
     */
    @Select("SELECT * FROM sys_role")
    @Results({
            @Result(property = "roleId",  column = "roleId"),
            @Result(property = "roleName",  column = "roleName"),
            @Result(property = "roleDesc",  column = "roleDesc"),
            @Result(property = "role",  column = "role")
    })
    List<SysRole> findAll();

    /**
     * 根据ID查询系统用户
     * @param roleId
     * @return
     */
    @Select("SELECT roleId,roleName,roleDesc,role FROM sys_role WHERE roleId = #{roleId}")
    @Results({
            @Result(property = "roleId",  column = "roleId"),
            @Result(property = "roleName",  column = "roleName"),
            @Result(property = "roleDesc",  column = "roleDesc"),
            @Result(property = "role",  column = "role")
    })
    SysRole findOne(int roleId);

    /**
     * 插入系统用户
     * @param sysRole
     */
    @Insert("INSERT INTO sys_role(roleName,roleDesc,role) VALUES(#{roleName},#{roleDesc},#{role})")
    void insert(SysRole sysRole);

    /**
     * 更新系统用户信息
     * @param sysRole
     */
    @Update("UPDATE sys_role SET roleName=#{roleName},roleDesc=#{roleDesc},role=#{role}")
    void update(SysRole sysRole);

    /**
     * 删除指定角色
     * @param roleId
     */
    @Delete("DELETE FROM sys_role WHERE roleId =#{roleId}")
    void delete(int roleId);
}
