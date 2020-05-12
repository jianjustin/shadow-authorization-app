package org.jian.shadow.controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.jian.shadow.common.log.ShadowLog;
import org.jian.shadow.domain.SysResource;
import org.jian.shadow.service.SysResourceService;
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
public class SysResourceController {
    @Autowired
    public SysResourceService sysResourceService;

    @GetMapping("/sys/resource")
    @PreAuthorize("hasAuthority('sys.resource.query')")
    @ShadowLog(description = "查询所有资源")
    public List<SysResource> findAll(){
        return sysResourceService.findAll();
    }

    @GetMapping("/sys/resource/findAllByPage")
    @PreAuthorize("hasAuthority('sys.resource.query')")
    @ShadowLog(description = "分页查询资源")
    public List<SysResource> findAllByPage(
    		@PageableDefault(page = 0, size = 10, direction = Sort.Direction.DESC) Pageable pageable){
        return sysResourceService.findAllByPage(pageable);
    }
    
    @GetMapping("/sys/resource/{id}")
    @PreAuthorize("hasAuthority('sys.resource.query')")
    @ShadowLog(description = "查询指定资源")
    public SysResource findOne(@PathVariable("id") int id){
        return sysResourceService.findOne(id);
    }

    @PostMapping("/sys/resource")
    @PreAuthorize("hasAuthority('sys.resource.insert')")
    @ShadowLog(description = "添加资源")
    public void insert(@RequestBody SysResource sysResource){
    	sysResource.setCreateDate(Timestamp.valueOf(LocalDateTime.now()));
        sysResourceService.insert(sysResource);
    }

    @PutMapping("/sys/resource")
    @PreAuthorize("hasAuthority('sys.resource.update')")
    @ShadowLog(description = "修改资源信息")
    public void update(@RequestBody SysResource sysResource){
        sysResourceService.update(sysResource);
    }

    @DeleteMapping("/sys/resource/{id}")
    @PreAuthorize("hasAuthority('sys.resource.delete')")
    @ShadowLog(description = "删除资源信息")
    public void delete(@PathVariable("id") int id){
        sysResourceService.delete(id);
    }
}
