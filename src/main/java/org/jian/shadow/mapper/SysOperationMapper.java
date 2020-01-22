package org.jian.shadow.mapper;

import org.apache.ibatis.annotations.*;
import org.jian.shadow.entity.SysOperation;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component(value = "sysOperationMapper")
public interface SysOperationMapper {
    /**
     * 查询所有系统API
     * @return
     */
    @Select("SELECT id,name,api,url FROM sys_operation")
    @Results({
            @Result(property = "id",  column = "id"),
            @Result(property = "name",  column = "name"),
            @Result(property = "api",  column = "api"),
            @Result(property = "url",  column = "url")
    })
    List<SysOperation> findAll();

    /**
     * 根据指定系统API
     * @param id
     * @return
     */
    @Select("SELECT id,name,api,url FROM sys_operation WHERE id = #{id}")
    @Results({
            @Result(property = "id",  column = "id"),
            @Result(property = "name",  column = "name"),
            @Result(property = "api",  column = "api"),
            @Result(property = "url",  column = "url")
    })
    SysOperation findOne(int id);

    /**
     * 插入系统API
     * @param sysOperation
     */
    @Insert("INSERT INTO sys_operation(name,api,url) VALUES(#{name},#{api},#{url})")
    void insert(SysOperation sysOperation);

    /**
     * 更新系统API信息
     * @param sysOperation
     */
    @Update("UPDATE sys_operation SET name=#{name},api=#{api},url=#{url}")
    void update(SysOperation sysOperation);

    /**
     * 删除系统API
     * @param id
     */
    @Delete("DELETE FROM sys_operation WHERE id =#{id}")
    void delete(int id);
}
