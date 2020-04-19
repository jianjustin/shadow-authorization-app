package org.jian.shadow.mapper;

import org.apache.ibatis.annotations.*;
import org.jian.shadow.domain.SysUserRole;
import org.springframework.stereotype.Component;
import java.util.List;

@Mapper
@Component(value = "sysUserRoleMapper")
public interface SysUserRoleMapper {

    @Select("SELECT * FROM sys_user_role")
    @Results({
    	@Result(property = "id",  column = "id"),
    	@Result(property = "userId",  column = "user_id"),
    	@Result(property = "roleId",  column = "role_id")
    })
    List<SysUserRole> findAll();

    @Select("SELECT id,user_id,role_id FROM sys_user_role WHERE id = #{id}")
    @Results({
    	@Result(property = "id",  column = "id"),
    	@Result(property = "userId",  column = "user_id"),
    	@Result(property = "roleId",  column = "role_id")
    })
    SysUserRole findOne(int id);

    @Insert("INSERT INTO sys_user_role(id,user_id,role_id) VALUES(#{id},#{userId},#{roleId})")
    void insert(SysUserRole sysUserRole);

    @Update("UPDATE sys_user_role SET id=#{id},user_id=#{userId},role_id=#{roleId})")
    void update(SysUserRole sysUserRole);

    @Delete("DELETE FROM sys_user_role WHERE id = #{id}")
    void delete(int id);
}
