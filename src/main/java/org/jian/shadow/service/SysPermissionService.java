package org.jian.shadow.service;

import java.util.List;

import org.jian.shadow.common.PageInfo;
import org.jian.shadow.domain.SysPermission;
import org.jian.shadow.mapper.SysPermissionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysPermissionService {
    @Autowired
    public SysPermissionMapper sysPermissionMapper;

    public List<SysPermission> findAll(){
        return sysPermissionMapper.findAll();
    }
    
    public List<SysPermission> findAllByPage(PageInfo pageInfo){
        return sysPermissionMapper.findAllByPage(pageInfo.getOffset(), pageInfo.getLimit());
    }

    public SysPermission findOne(int id){
        return sysPermissionMapper.findOne(id);
    }

    public void insert(SysPermission sysPermission){
        sysPermissionMapper.insert(sysPermission);
    }

    public void update(SysPermission sysPermission){
        sysPermissionMapper.update(sysPermission);
    }

    public void delete(int id){
        sysPermissionMapper.delete(id);
    }
}
