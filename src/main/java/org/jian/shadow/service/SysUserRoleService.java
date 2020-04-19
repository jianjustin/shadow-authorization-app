package org.jian.shadow.service;

import org.jian.shadow.domain.SysUserRole;
import org.jian.shadow.mapper.SysUserRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserRoleService {
    @Autowired
    public SysUserRoleMapper sysUserRoleMapper;

    public List<SysUserRole> findAll(){
        return sysUserRoleMapper.findAll();
    }

    public SysUserRole findOne(int id){
        return sysUserRoleMapper.findOne(id);
    }

    public void insert(SysUserRole sysUserRole){
        sysUserRoleMapper.insert(sysUserRole);
    }

    public void update(SysUserRole sysUserRole){
        sysUserRoleMapper.update(sysUserRole);
    }

    public void delete(int id){
        sysUserRoleMapper.delete(id);
    }
}
