package org.jian.shadow.controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.jian.shadow.common.PageInfo;
import org.jian.shadow.common.ResponseEntityInfo;
import org.jian.shadow.common.log.ShadowLog;
import org.jian.shadow.domain.SysRole;
import org.jian.shadow.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SysRoleController {
    @Autowired
    public SysRoleService sysRoleService;

    @GetMapping("/sys/role")
    @PreAuthorize("hasAuthority('sys.role.query')")
    @ShadowLog(description = "查询所有角色")
    public ResponseEntityInfo<SysRole> findAll(){
    	List<SysRole> list = sysRoleService.findAll();
    	ResponseEntityInfo<SysRole> res = new ResponseEntityInfo<SysRole>(HttpStatus.OK, null, list, null, null, "查询成功");
        return res;
    }
    
    @PostMapping("/sys/role/findAllByPage")
    @PreAuthorize("hasAuthority('sys.role.query')")
    @ShadowLog(description = "分页查询所有角色")
    public ResponseEntityInfo<SysRole> findAllByPage(
    		@RequestBody PageInfo pageInfo){
    	Pageable pageable = PageRequest.of(pageInfo.getPage()-1, pageInfo.getSize());
    	Page<SysRole> data = sysRoleService.findAllByPage(pageable);
    	pageInfo.setTotal(data.getTotalElements());
    	ResponseEntityInfo<SysRole> res = new ResponseEntityInfo<SysRole>(HttpStatus.OK, null, data.getContent(), pageInfo, null, "分页查询成功");
        return res;
    }

    @GetMapping("/sys/role/{id}")
    @PreAuthorize("hasAuthority('sys.role.query')")
    @ShadowLog(description = "查询角色信息")
    public ResponseEntityInfo<SysRole> findOne(@PathVariable("id") int id){
    	SysRole sysRole = sysRoleService.findOne(id);
    	ResponseEntityInfo<SysRole> res = new ResponseEntityInfo<SysRole>(HttpStatus.OK, sysRole, null, null, null, "角色查询成功");
        return res;
    }

    @PostMapping("/sys/role")
    @PreAuthorize("hasAuthority('sys.role.save')")
    @ShadowLog(description = "添加新角色")
    public ResponseEntityInfo<SysRole> save(@RequestBody SysRole sysRole){
    	sysRole.setCreateDate(Timestamp.valueOf(LocalDateTime.now()));
        sysRole = sysRoleService.insert(sysRole);
        ResponseEntityInfo<SysRole> res = new ResponseEntityInfo<SysRole>(HttpStatus.OK, sysRole, null, null, null, "角色添加成功");
        return res;
    }

    @PutMapping("/sys/role")
    @PreAuthorize("hasAuthority('sys.role.update')")
    @ShadowLog(description = "更新角色信息")
    public ResponseEntityInfo<SysRole> update(@RequestBody SysRole sysRole){
    	SysRole oldSysRole = sysRoleService.findOne(sysRole.getRoleId());
    	if(null != sysRole.getRoleName() && !"".equals(sysRole.getRoleName()))oldSysRole.setRoleName(sysRole.getRoleName());
    	oldSysRole.setRoleType(sysRole.getRoleType());
        oldSysRole = sysRoleService.update(oldSysRole);
        ResponseEntityInfo<SysRole> res = new ResponseEntityInfo<SysRole>(HttpStatus.OK, oldSysRole, null, null, null, "角色修改成功");
        return res;
    }

    @DeleteMapping("/sys/role/{id}")
    @PreAuthorize("hasAuthority('sys.role.delete')")
    @ShadowLog(description = "删除指定角色")
    public ResponseEntityInfo<SysRole> delete(@PathVariable("id") int id){
    	SysRole oldSysRole = sysRoleService.findOne(id);
    	sysRoleService.delete(id);
        ResponseEntityInfo<SysRole> res = new ResponseEntityInfo<SysRole>(HttpStatus.OK, oldSysRole, null, null, null, "角色删除成功");
        return res;
    }
}
