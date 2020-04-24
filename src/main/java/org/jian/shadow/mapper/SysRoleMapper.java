package org.jian.shadow.mapper;

import org.apache.ibatis.annotations.*;
import org.jian.shadow.domain.SysRole;
import org.springframework.stereotype.Component;
import java.util.List;

@Mapper
@Component(value = "sysRoleMapper")
public interface SysRoleMapper {

    @Select("SELECT * FROM sys_role")
    @Results({
    	@Result(property = "id",  column = "id"),
    	@Result(property = "roleName",  column = "role_name"),
    	@Result(property = "roleType",  column = "role_type"),
    	@Result(property = "createDate",  column = "create_date"),
    	@Result(property = "orderBy",  column = "order_by")
    })
    List<SysRole> findAll();
    
    @Select("SELECT * FROM sys_role limit #{offset}, #{limit}")
    @Results({
    	@Result(property = "id",  column = "id"),
    	@Result(property = "roleName",  column = "role_name"),
    	@Result(property = "roleType",  column = "role_type"),
    	@Result(property = "createDate",  column = "create_date"),
    	@Result(property = "orderBy",  column = "order_by")
    })
    List<SysRole> findAllByPage(int offset, int limit);
    
    @Select("SELECT count(*) FROM sys_role")
    int findAllCount();

    @Select("SELECT id,role_name,role_type,create_date,order_by FROM sys_role WHERE id = #{id}")
    @Results({
    	@Result(property = "id",  column = "id"),
    	@Result(property = "roleName",  column = "role_name"),
    	@Result(property = "roleType",  column = "role_type"),
    	@Result(property = "createDate",  column = "create_date"),
    	@Result(property = "orderBy",  column = "order_by")
    })
    SysRole findOne(int id);

    @Insert("INSERT INTO sys_role(id,role_name,role_type,create_date,order_by) VALUES(#{id},#{roleName},#{roleType},#{createDate},#{orderBy})")
    void insert(SysRole sysRole);

    @Update("UPDATE sys_role SET role_name=#{roleName},role_type=#{roleType},create_date=#{createDate},order_by=#{orderBy} where id=#{id}")
    void update(SysRole sysRole);

    @Delete("DELETE FROM sys_role WHERE id = #{id}")
    void delete(int id);
}
