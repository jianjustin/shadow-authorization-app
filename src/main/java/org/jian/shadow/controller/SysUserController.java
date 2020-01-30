package org.jian.shadow.controller;

import org.jian.shadow.entity.SysUser;
import org.jian.shadow.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.sql.Date;
import java.util.List;

@RestController
public class SysUserController {
    @Autowired
    public SysUserService sysUserService;

    @GetMapping("/sys/user")
    @PreAuthorize("hasAuthority('sys.user.findAll')")
    public List<SysUser> findAll(){
        return sysUserService.findAll();
    }

    @GetMapping("/sys/user/{id}")
    @PreAuthorize("hasAuthority('sys.user.findOne')")
    public SysUser findOne(@PathVariable("id") int id){
        return sysUserService.findOne(id);
    }

    @PostMapping("/sys/user")
    @PreAuthorize("hasAuthority('sys.user.insert')")
    public void insert(@RequestBody SysUser sysUser){
        java.util.Date now = new java.util.Date();
        sysUser.regTime = new Date(now.getTime());
        sysUserService.insert(sysUser);
    }

    @PutMapping("/sys/user")
    @PreAuthorize("hasAuthority('sys.user.update')")
    public void update(@RequestBody SysUser sysUser){
        sysUserService.update(sysUser);
    }

    @DeleteMapping("/sys/user/{id}")
    @PreAuthorize("hasAuthority('sys.user.delete')")
    public void delete(@PathVariable("id") int id){
        sysUserService.delete(id);
    }

}
