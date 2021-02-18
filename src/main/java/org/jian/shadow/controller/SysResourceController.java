package org.jian.shadow.controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

import org.jian.shadow.common.PageInfo;
import org.jian.shadow.common.ResponseEntityInfo;
import org.jian.shadow.common.log.ShadowLog;
import org.jian.shadow.domain.SysResource;
import org.jian.shadow.service.SysResourceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
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
    public ResponseEntityInfo<SysResource> findAll(){
    	List<SysResource> list = sysResourceService.findAll();
    	ResponseEntityInfo<SysResource> res = new ResponseEntityInfo<SysResource>(HttpStatus.OK, null, list, null, null, "查询成功");
        return res;
    }

    @PostMapping("/sys/resource/findAllByPage")
    @PreAuthorize("hasAuthority('sys.resource.query')")
    @ShadowLog(description = "分页查询资源")
    public ResponseEntityInfo<SysResource> findAllByPage(
    		@RequestBody PageInfo pageInfo){
    	Pageable pageable = PageRequest.of(pageInfo.getPage()-1, pageInfo.getSize());
    	Page<SysResource> data = sysResourceService.findAllByPage(pageable);
    	pageInfo.setTotal(data.getTotalElements());
    	ResponseEntityInfo<SysResource> res = new ResponseEntityInfo<SysResource>(HttpStatus.OK, null, data.getContent(), pageInfo, null, "分页查询成功");
        return res;
    }
    
    @GetMapping("/sys/resource/{id}")
    @PreAuthorize("hasAuthority('sys.resource.query')")
    @ShadowLog(description = "查询指定资源")
    public ResponseEntityInfo<SysResource> findOne(@PathVariable("id") String id){
    	SysResource sysResource = sysResourceService.findOne(id);
    	ResponseEntityInfo<SysResource> res = new ResponseEntityInfo<SysResource>(HttpStatus.OK, sysResource, null, null, null, "资源查询成功");
        return res;
    }

    @PostMapping("/sys/resource")
    @PreAuthorize("hasAuthority('sys.resource.save')")
    @ShadowLog(description = "添加资源")
    public ResponseEntityInfo<SysResource> save(@RequestBody SysResource sysResource){
    	sysResource.setCreateDate(Timestamp.valueOf(LocalDateTime.now()));
    	sysResource = sysResourceService.insert(sysResource);
    	ResponseEntityInfo<SysResource> res = new ResponseEntityInfo<SysResource>(HttpStatus.OK, sysResource, null, null, null, "资源添加成功");
        return res;
    }

    @PutMapping("/sys/resource")
    @PreAuthorize("hasAuthority('sys.resource.update')")
    @ShadowLog(description = "修改资源信息")
    public ResponseEntityInfo<SysResource> update(@RequestBody SysResource sysResource){
    	SysResource oldSysResource = sysResourceService.findOne(sysResource.getResourceId());
    	if(null != sysResource.getResourceName())oldSysResource.setResourceName(sysResource.getResourceName());
    	if(null != sysResource.getResourceUrl())oldSysResource.setResourceUrl(sysResource.getResourceUrl());
    	if(null != sysResource.getResourceOperation())oldSysResource.setResourceOperation(sysResource.getResourceOperation());
    	oldSysResource.setResourceType(sysResource.getResourceType());
    	oldSysResource = sysResourceService.update(sysResource);
        ResponseEntityInfo<SysResource> res = new ResponseEntityInfo<SysResource>(HttpStatus.OK, oldSysResource, null, null, null, "资源信息修改成功");
        return res;
    }

    @DeleteMapping("/sys/resource/{id}")
    @PreAuthorize("hasAuthority('sys.resource.delete')")
    @ShadowLog(description = "删除资源信息")
    public ResponseEntityInfo<SysResource> delete(@PathVariable("id") String id){
    	SysResource oldSysResource = sysResourceService.findOne(id);
        sysResourceService.delete(id);
        ResponseEntityInfo<SysResource> res = new ResponseEntityInfo<SysResource>(HttpStatus.OK, oldSysResource, null, null, null, "资源删除成功");
        return res;
    }
}
