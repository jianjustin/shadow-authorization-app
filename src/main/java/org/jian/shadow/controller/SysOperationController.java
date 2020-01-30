package org.jian.shadow.controller;

import org.jian.shadow.entity.SysOperation;
import org.jian.shadow.service.SysOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SysOperationController {
    @Autowired
    public SysOperationService sysOperationService;

    @GetMapping("/sys/operation")
    @PreAuthorize("hasAuthority('sys.operation.findAll')")
    public List<SysOperation> findAll(){
        return sysOperationService.findAll();
    }

    @GetMapping("/sys/operation/{id}")
    @PreAuthorize("hasAuthority('sys.operation.findOne')")
    public SysOperation findOne(@PathVariable("id") int id){
        return sysOperationService.findOne(id);
    }

    @PostMapping("/sys/operation")
    @PreAuthorize("hasAuthority('sys.operation.insert')")
    public void insert(@RequestBody SysOperation sysOperation){
        sysOperationService.insert(sysOperation);
    }

    @PutMapping("/sys/operation")
    @PreAuthorize("hasAuthority('sys.operation.update')")
    public void update(@RequestBody SysOperation sysOperation){
        sysOperationService.update(sysOperation);
    }

    @DeleteMapping("/sys/operation/{id}")
    @PreAuthorize("hasAuthority('sys.operation.delete')")
    public void delete(@PathVariable("id") int id){
        sysOperationService.delete(id);
    }
}
