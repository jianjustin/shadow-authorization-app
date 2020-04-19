package org.jian.shadow.mapper;

import org.apache.ibatis.annotations.*;
import org.jian.shadow.domain.SysResource;
import org.jian.shadow.domain.SysUser;
import org.springframework.stereotype.Component;
import java.util.List;

@Mapper
@Component(value = "sysUserMapper")
public interface SysUserMapper {
	
	@Select("SELECT resource_name,resource_url,resource_operation,resource_type FROM sys_resource s WHERE s.id IN ("
			+ "SELECT resource_id FROM sys_permission t WHERE t.role_id IN ("
			+ "SELECT role_id FROM sys_user_role a WHERE a.user_id = #{id}"
			+ ")"
			+ ")")
    @Results({
    	@Result(property = "resourceName",  column = "resource_name"),
    	@Result(property = "resourceUrl",  column = "resource_url"),
    	@Result(property = "resourceOperation",  column = "resource_operation"),
    	@Result(property = "resourceType",  column = "resource_type")
    })
    List<SysResource> findAuthorityByUser(int id);
	
	
	@Select("SELECT id,username,password,department_id,post_id,last_login FROM sys_user WHERE username = #{username}")
    @Results({
    	@Result(property = "id",  column = "id"),
    	@Result(property = "username",  column = "username"),
    	@Result(property = "password",  column = "password"),
    	@Result(property = "departmentId",  column = "department_id"),
    	@Result(property = "postId",  column = "post_id"),
    	@Result(property = "lastLogin",  column = "last_login")
    })
    SysUser findByUserName(String username);

    @Select("SELECT * FROM sys_user")
    @Results({
    	@Result(property = "id",  column = "id"),
    	@Result(property = "username",  column = "username"),
    	@Result(property = "password",  column = "password"),
    	@Result(property = "departmentId",  column = "department_id"),
    	@Result(property = "postId",  column = "post_id"),
    	@Result(property = "lastLogin",  column = "last_login"),
    	@Result(property = "createDate",  column = "create_date"),
    	@Result(property = "orderBy",  column = "order_by")
    })
    List<SysUser> findAll();

    @Select("SELECT id,username,password,department_id,post_id,last_login,create_date,order_by FROM sys_user WHERE id = #{id}")
    @Results({
    	@Result(property = "id",  column = "id"),
    	@Result(property = "username",  column = "username"),
    	@Result(property = "password",  column = "password"),
    	@Result(property = "departmentId",  column = "department_id"),
    	@Result(property = "postId",  column = "post_id"),
    	@Result(property = "lastLogin",  column = "last_login"),
    	@Result(property = "createDate",  column = "create_date"),
    	@Result(property = "orderBy",  column = "order_by")
    })
    SysUser findOne(int id);

    @Insert("INSERT INTO sys_user(id,username,password,department_id,post_id,last_login,create_date,order_by) VALUES(#{id},#{username},#{password},#{departmentId},#{postId},#{lastLogin},#{createDate},#{orderBy})")
    void insert(SysUser sysUser);

    @Update("UPDATE sys_user SET id=#{id},username=#{username},password=#{password},department_id=#{departmentId},post_id=#{postId},last_login=#{lastLogin},create_date=#{createDate},order_by=#{orderBy})")
    void update(SysUser sysUser);

    @Delete("DELETE FROM sys_user WHERE id = #{id}")
    void delete(int id);
}
