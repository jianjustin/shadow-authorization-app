package org.jian.shadow.controller;

import java.util.List;

import org.jian.shadow.common.PageInfo;
import org.jian.shadow.domain.SysResource;
import org.jian.shadow.service.SysResourceService;
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
public class SysResourceController {
    @Autowired
    public SysResourceService sysResourceService;

    @GetMapping("/sys/resource")
    @PreAuthorize("hasAuthority('sys.resource.findAll')")
    public List<SysResource> findAll(){
        return sysResourceService.findAll();
    }

    @PostMapping("/sys/resource/findAllByPage")
    @PreAuthorize("hasAuthority('sys.resource.findAll')")
    public List<SysResource> findAllByPage(@RequestBody PageInfo pageInfo){
        return sysResourceService.findAllByPage(pageInfo);
    }
    
    @GetMapping("/sys/resource/{id}")
    @PreAuthorize("hasAuthority('sys.resource.findOne')")
    public SysResource findOne(@PathVariable("id") int id){
        return sysResourceService.findOne(id);
    }

    @PostMapping("/sys/resource")
    @PreAuthorize("hasAuthority('sys.resource.insert')")
    public void insert(@RequestBody SysResource sysResource){
        sysResourceService.insert(sysResource);
    }

    @PutMapping("/sys/resource")
    @PreAuthorize("hasAuthority('sys.resource.update')")
    public void update(@RequestBody SysResource sysResource){
        sysResourceService.update(sysResource);
    }

    @DeleteMapping("/sys/resource/{id}")
    @PreAuthorize("hasAuthority('sys.resource.delete')")
    public void delete(@PathVariable("id") int id){
        sysResourceService.delete(id);
    }
}
