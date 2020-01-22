package org.jian.shadow.controller;

import org.jian.shadow.entity.SysRole;
import org.jian.shadow.entity.SysUser;
import org.jian.shadow.service.SysRoleService;
import org.jian.shadow.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
public class SysRoleController {
    @Autowired
    public SysRoleService sysRoleService;

    @GetMapping("/sys/role")
    public List<SysRole> findAll(){
        return sysRoleService.findAll();
    }

    @GetMapping("/sys/role/{id}")
    public SysRole findOne(@PathVariable("id") int id){
        return sysRoleService.findOne(id);
    }

    @PostMapping("/sys/role")
    public void insert(@RequestBody SysRole sysRole){
        sysRoleService.insert(sysRole);
    }

    @PutMapping("/sys/role")
    public void update(@RequestBody SysRole sysRole){
        sysRoleService.update(sysRole);
    }

    @DeleteMapping("/sys/role/{id}")
    public void delete(@PathVariable("id") int id){
        sysRoleService.delete(id);
    }
}
