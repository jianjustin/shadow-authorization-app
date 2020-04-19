package org.jian.shadow.controller;

import org.jian.shadow.domain.SysPermission;
import org.jian.shadow.service.SysPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class SysPermissionController {
    @Autowired
    public SysPermissionService sysPermissionService;

    @GetMapping("/sys/permission")
    @PreAuthorize("hasAuthority('sys.permission.findAll')")
    public List<SysPermission> findAll(){
        return sysPermissionService.findAll();
    }

    @GetMapping("/sys/permission/{id}")
    @PreAuthorize("hasAuthority('sys.permission.findOne')")
    public SysPermission findOne(@PathVariable("id") int id){
        return sysPermissionService.findOne(id);
    }

    @PostMapping("/sys/permission")
    @PreAuthorize("hasAuthority('sys.permission.insert')")
    public void insert(@RequestBody SysPermission sysPermission){
        sysPermissionService.insert(sysPermission);
    }

    @PutMapping("/sys/permission")
    @PreAuthorize("hasAuthority('sys.permission.update')")
    public void update(@RequestBody SysPermission sysPermission){
        sysPermissionService.update(sysPermission);
    }

    @DeleteMapping("/sys/permission/{id}")
    @PreAuthorize("hasAuthority('sys.permission.delete')")
    public void delete(@PathVariable("id") int id){
        sysPermissionService.delete(id);
    }
}
