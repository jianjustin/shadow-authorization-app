package org.jian.shadow.mapper;

import org.apache.ibatis.annotations.*;
import org.jian.shadow.domain.SysPermission;
import org.springframework.stereotype.Component;
import java.util.List;

@Mapper
@Component(value = "sysPermissionMapper")
public interface SysPermissionMapper {

    @Select("SELECT * FROM sys_permission")
    @Results({
    	@Result(property = "id",  column = "id"),
    	@Result(property = "resourceId",  column = "resource_id"),
    	@Result(property = "roleId",  column = "role_id"),
    	@Result(property = "permissionStatus",  column = "permission_status"),
    	@Result(property = "createDate",  column = "create_date"),
    	@Result(property = "orderBy",  column = "order_by")
    })
    List<SysPermission> findAll();

    @Select("SELECT id,resource_id,role_id,permission_status,create_date,order_by FROM sys_permission WHERE id = #{id}")
    @Results({
    	@Result(property = "id",  column = "id"),
    	@Result(property = "resourceId",  column = "resource_id"),
    	@Result(property = "roleId",  column = "role_id"),
    	@Result(property = "permissionStatus",  column = "permission_status"),
    	@Result(property = "createDate",  column = "create_date"),
    	@Result(property = "orderBy",  column = "order_by")
    })
    SysPermission findOne(int id);

    @Insert("INSERT INTO sys_permission(id,resource_id,role_id,permission_status,create_date,order_by) VALUES(#{id},#{resourceId},#{roleId},#{permissionStatus},#{createDate},#{orderBy})")
    void insert(SysPermission sysPermission);

    @Update("UPDATE sys_permission SET id=#{id},resource_id=#{resourceId},role_id=#{roleId},permission_status=#{permissionStatus},create_date=#{createDate},order_by=#{orderBy})")
    void update(SysPermission sysPermission);

    @Delete("DELETE FROM sys_permission WHERE id = #{id}")
    void delete(int id);
}
