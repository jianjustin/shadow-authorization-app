package org.jian.shadow.controller;

import java.util.List;

import org.jian.shadow.common.log.ShadowLog;
import org.jian.shadow.domain.SysUser;
import org.jian.shadow.service.SysUserService;
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
public class SysUserController {
    @Autowired
    public SysUserService sysUserService;

    @GetMapping("/sys/user")
    @PreAuthorize("hasAuthority('sys.user.query')")
    @ShadowLog(description = "查询用户")
    public List<SysUser> findAll(){
        return sysUserService.findAll();
    }
    
    @GetMapping("/sys/user/findAllByPage")
    @PreAuthorize("hasAuthority('sys.user.query')")
    @ShadowLog(description = "分页查询用户")
    public List<SysUser> findAllByPage(
    		@PageableDefault(page = 0, size = 10, direction = Sort.Direction.DESC) Pageable pageable){
        return sysUserService.findAllByPage(pageable);
    }

    @GetMapping("/sys/user/{id}")
    @PreAuthorize("hasAuthority('sys.user.query')")
    @ShadowLog(description = "查询指定用户")
    public SysUser findOne(@PathVariable("id") int id){
        return sysUserService.findOne(id);
    }

    @PostMapping("/sys/user")
    @PreAuthorize("hasAuthority('sys.user.insert')")
    @ShadowLog(description = "添加用户")
    public void insert(@RequestBody SysUser sysUser){
        sysUserService.insert(sysUser);
    }

    @PutMapping("/sys/user")
    @PreAuthorize("hasAuthority('sys.user.update')")
    @ShadowLog(description = "修改用户信息")
    public void update(@RequestBody SysUser sysUser){
        sysUserService.update(sysUser);
    }

    @DeleteMapping("/sys/user/{id}")
    @PreAuthorize("hasAuthority('sys.user.delete')")
    @ShadowLog(description = "删除指定用户")
    public void delete(@PathVariable("id") int id){
        sysUserService.delete(id);
    }
}
