package org.jian.shadow.controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.jian.shadow.common.log.ShadowLog;
import org.jian.shadow.domain.SysPermission;
import org.jian.shadow.service.SysPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SysPermissionController {
    @Autowired
    public SysPermissionService sysPermissionService;

    @GetMapping("/sys/permission")
    @PreAuthorize("hasAuthority('sys.permission.query')")
    @ShadowLog(description = "查询所有权限")
    public List<SysPermission> findAll(){
        return sysPermissionService.findAll();
    }
    
    @GetMapping("/sys/permission/findAllByPage")
    @PreAuthorize("hasAuthority('sys.permission.query')")
    @ShadowLog(description = "分页查询所有权限")
    public List<SysPermission> findAllByPage(
    		@PageableDefault(page = 0, size = 10, direction = Sort.Direction.DESC) Pageable pageable){
        return sysPermissionService.findAllByPage(pageable);
    }

    @GetMapping("/sys/permission/{id}")
    @PreAuthorize("hasAuthority('sys.permission.query')")
    @ShadowLog(description = "查询指定权限信息")
    public SysPermission findOne(@PathVariable("id") int id){
        return sysPermissionService.findOne(id);
    }

    @PostMapping("/sys/permission")
    @PreAuthorize("hasAuthority('sys.permission.insert')")
    @ShadowLog(description = "添加权限")
    public void insert(@RequestBody SysPermission sysPermission){
    	sysPermission.setCreateDate(Timestamp.valueOf(LocalDateTime.now()));
        sysPermissionService.insert(sysPermission);
    }

    @PutMapping("/sys/permission")
    @PreAuthorize("hasAuthority('sys.permission.update')")
    @ShadowLog(description = "更新权限")
    public void update(@RequestBody SysPermission sysPermission){
        sysPermissionService.update(sysPermission);
    }

    @DeleteMapping("/sys/permission/{id}")
    @PreAuthorize("hasAuthority('sys.permission.delete')")
    @ShadowLog(description = "删除权限")
    public void delete(@PathVariable("id") int id){
        sysPermissionService.delete(id);
    }
}
