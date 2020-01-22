package org.jian.shadow.controller;

import org.jian.shadow.entity.SysOperation;
import org.jian.shadow.service.SysOperationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class SysOperationController {
    @Autowired
    public SysOperationService sysOperationService;

    @GetMapping("/sys/operation")
    public List<SysOperation> findAll(){
        return sysOperationService.findAll();
    }

    @GetMapping("/sys/operation/{id}")
    public SysOperation findOne(@PathVariable("id") int id){
        return sysOperationService.findOne(id);
    }

    @PostMapping("/sys/operation")
    public void insert(@RequestBody SysOperation sysOperation){
        sysOperationService.insert(sysOperation);
    }

    @PutMapping("/sys/operation")
    public void update(@RequestBody SysOperation sysOperation){
        sysOperationService.update(sysOperation);
    }

    @DeleteMapping("/sys/operation/{id}")
    public void delete(@PathVariable("id") int id){
        sysOperationService.delete(id);
    }
}
