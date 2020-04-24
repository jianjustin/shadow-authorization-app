package org.jian.shadow.controller;

import java.util.List;

import org.jian.shadow.common.PageInfo;
import org.jian.shadow.domain.SysUser;
import org.jian.shadow.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SysUserController {
    @Autowired
    public SysUserService sysUserService;

    @GetMapping("/sys/user")
    @PreAuthorize("hasAuthority('sys.user.findAll')")
    public List<SysUser> findAll(){
        return sysUserService.findAll();
    }
    
    @PostMapping("/sys/user/findAllByPage")
    @PreAuthorize("hasAuthority('sys.user.findAll')")
    public List<SysUser> findAllByPage(@RequestBody PageInfo pageInfo){
        return sysUserService.findAllByPage(pageInfo);
    }

    @GetMapping("/sys/user/{id}")
    @PreAuthorize("hasAuthority('sys.user.findOne')")
    public SysUser findOne(@PathVariable("id") int id){
        return sysUserService.findOne(id);
    }

    @PostMapping("/sys/user")
    @PreAuthorize("hasAuthority('sys.user.insert')")
    public void insert(@RequestBody SysUser sysUser){
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
