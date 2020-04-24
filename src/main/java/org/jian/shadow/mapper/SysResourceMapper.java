package org.jian.shadow.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.jian.shadow.domain.SysResource;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "sysResourceMapper")
public interface SysResourceMapper {

    @Select("SELECT * FROM sys_resource")
    @Results({
    	@Result(property = "id",  column = "id"),
    	@Result(property = "resourceName",  column = "resource_name"),
    	@Result(property = "resourceUrl",  column = "resource_url"),
    	@Result(property = "resourceOperation",  column = "resource_operation"),
    	@Result(property = "resourceType",  column = "resource_type"),
    	@Result(property = "createDate",  column = "create_date"),
    	@Result(property = "orderBy",  column = "order_by")
    })
    List<SysResource> findAll();
    
    @Select("SELECT * FROM sys_resource limit #{offset}, #{limit}")
    @Results({
    	@Result(property = "id",  column = "id"),
    	@Result(property = "resourceName",  column = "resource_name"),
    	@Result(property = "resourceUrl",  column = "resource_url"),
    	@Result(property = "resourceOperation",  column = "resource_operation"),
    	@Result(property = "resourceType",  column = "resource_type"),
    	@Result(property = "createDate",  column = "create_date"),
    	@Result(property = "orderBy",  column = "order_by")
    })
    List<SysResource> findAllByPage(int offset, int limit);
    
    @Select("SELECT count(*) FROM sys_resource")
    int findAllCount();

    @Select("SELECT id,resource_name,resource_url,resource_operation,resource_type,create_date,order_by FROM sys_resource WHERE id = #{id}")
    @Results({
    	@Result(property = "id",  column = "id"),
    	@Result(property = "resourceName",  column = "resource_name"),
    	@Result(property = "resourceUrl",  column = "resource_url"),
    	@Result(property = "resourceOperation",  column = "resource_operation"),
    	@Result(property = "resourceType",  column = "resource_type"),
    	@Result(property = "createDate",  column = "create_date"),
    	@Result(property = "orderBy",  column = "order_by")
    })
    SysResource findOne(int id);

    @Insert("INSERT INTO sys_resource(id,resource_name,resource_url,resource_operation,resource_type,create_date,order_by) VALUES(#{id},#{resourceName},#{resourceUrl},#{resourceOperation},#{resourceType},#{createDate},#{orderBy})")
    void insert(SysResource sysResource);

    @Update("UPDATE sys_resource SET id=#{id},resource_name=#{resourceName},resource_url=#{resourceUrl},resource_operation=#{resourceOperation},resource_type=#{resourceType},create_date=#{createDate},order_by=#{orderBy})")
    void update(SysResource sysResource);

    @Delete("DELETE FROM sys_resource WHERE id = #{id}")
    void delete(int id);
}
