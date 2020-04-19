package org.jian.shadow.controller;

import org.jian.shadow.domain.SysUserRole;
import org.jian.shadow.service.SysUserRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class SysUserRoleController {
    @Autowired
    public SysUserRoleService sysUserRoleService;

    @GetMapping("/sys/user/role")
    @PreAuthorize("hasAuthority('sys.user.role.findAll')")
    public List<SysUserRole> findAll(){
        return sysUserRoleService.findAll();
    }

    @GetMapping("/sys/user/role/{id}")
    @PreAuthorize("hasAuthority('sys.user.role.findOne')")
    public SysUserRole findOne(@PathVariable("id") int id){
        return sysUserRoleService.findOne(id);
    }

    @PostMapping("/sys/user/role")
    @PreAuthorize("hasAuthority('sys.user.role.insert')")
    public void insert(@RequestBody SysUserRole sysUserRole){
        sysUserRoleService.insert(sysUserRole);
    }

    @PutMapping("/sys/user/role")
    @PreAuthorize("hasAuthority('sys.user.role.update')")
    public void update(@RequestBody SysUserRole sysUserRole){
        sysUserRoleService.update(sysUserRole);
    }

    @DeleteMapping("/sys/user/role/{id}")
    @PreAuthorize("hasAuthority('sys.user.role.delete')")
    public void delete(@PathVariable("id") int id){
        sysUserRoleService.delete(id);
    }
}
