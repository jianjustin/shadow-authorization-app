package org.jian.shadow.controller;

import org.jian.shadow.entity.SysMenu;
import org.jian.shadow.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class SysMenuController {
    @Autowired
    public SysMenuService sysMenuService;

    @GetMapping("/sys/menu")
    public List<SysMenu> findAll(){
        return sysMenuService.findAll();
    }

    @GetMapping("/sys/menu/{id}")
    public SysMenu findOne(@PathVariable("id") int id){
        return sysMenuService.findOne(id);
    }

    @PostMapping("/sys/menu")
    public void insert(@RequestBody SysMenu sysMenu){
        sysMenuService.insert(sysMenu);
    }

    @PutMapping("/sys/menu")
    public void update(@RequestBody SysMenu sysMenu){
        sysMenuService.update(sysMenu);
    }

    @DeleteMapping("/sys/menu/{id}")
    public void delete(@PathVariable("id") int id){
        sysMenuService.delete(id);
    }
}
