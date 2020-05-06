package org.jian.shadow.controller;

import java.util.List;

import org.jian.shadow.common.log.ShadowLog;
import org.jian.shadow.domain.SysRole;
import org.jian.shadow.service.SysRoleService;
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
public class SysRoleController {
    @Autowired
    public SysRoleService sysRoleService;

    @GetMapping("/sys/role")
    @PreAuthorize("hasAuthority('sys.role.findAll')")
    public List<SysRole> findAll(){
        return sysRoleService.findAll();
    }
    
    @GetMapping("/sys/role/findAllByPage")
    @PreAuthorize("hasAuthority('sys.role.findAll')")
    @ShadowLog(description = "分页查询所有角色")
    public List<SysRole> findAllByPage(
    		@PageableDefault(page = 0, size = 10, direction = Sort.Direction.DESC) Pageable pageable){
        return sysRoleService.findAllByPage(pageable);
    }

    @GetMapping("/sys/role/{id}")
    @PreAuthorize("hasAuthority('sys.role.findOne')")
    public SysRole findOne(@PathVariable("id") int id){
        return sysRoleService.findOne(id);
    }

    @PostMapping("/sys/role")
    @PreAuthorize("hasAuthority('sys.role.insert')")
    public void insert(@RequestBody SysRole sysRole){
        sysRoleService.insert(sysRole);
    }

    @PutMapping("/sys/role")
    @PreAuthorize("hasAuthority('sys.role.update')")
    public void update(@RequestBody SysRole sysRole){
        sysRoleService.update(sysRole);
    }

    @DeleteMapping("/sys/role/{id}")
    @PreAuthorize("hasAuthority('sys.role.delete')")
    public void delete(@PathVariable("id") int id){
        sysRoleService.delete(id);
    }
}
