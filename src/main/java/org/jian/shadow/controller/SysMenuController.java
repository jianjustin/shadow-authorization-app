package org.jian.shadow.controller;

import org.jian.shadow.entity.SysMenu;
import org.jian.shadow.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class SysMenuController {
    @Autowired
    public SysMenuService sysMenuService;

    @GetMapping("/sys/menu")
    @PreAuthorize("hasAuthority('sys.menu.findAll')")
    public List<SysMenu> findAll(){
        return sysMenuService.findAll();
    }

    @GetMapping("/sys/menu/{id}")
    @PreAuthorize("hasAuthority('sys.menu.findOne')")
    public SysMenu findOne(@PathVariable("id") int id){
        return sysMenuService.findOne(id);
    }

    @PostMapping("/sys/menu")
    @PreAuthorize("hasAuthority('sys.menu.insert')")
    public void insert(@RequestBody SysMenu sysMenu){
        sysMenuService.insert(sysMenu);
    }

    @PutMapping("/sys/menu")
    @PreAuthorize("hasAuthority('sys.menu.update')")
    public void update(@RequestBody SysMenu sysMenu){
        sysMenuService.update(sysMenu);
    }

    @DeleteMapping("/sys/menu/{id}")
    @PreAuthorize("hasAuthority('sys.menu.delete')")
    public void delete(@PathVariable("id") int id){
        sysMenuService.delete(id);
    }
}
