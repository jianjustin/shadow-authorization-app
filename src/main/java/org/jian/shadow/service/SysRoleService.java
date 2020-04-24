package org.jian.shadow.service;

import org.jian.shadow.common.PageInfo;
import org.jian.shadow.domain.SysRole;
import org.jian.shadow.mapper.SysRoleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysRoleService {
    @Autowired
    public SysRoleMapper sysRoleMapper;

    public List<SysRole> findAll(){
        return sysRoleMapper.findAll();
    }
    
    public List<SysRole> findAllByPage(PageInfo pageInfo){
        return sysRoleMapper.findAllByPage(pageInfo.getOffset(), pageInfo.getLimit());
    }

    public SysRole findOne(int id){
        return sysRoleMapper.findOne(id);
    }

    public void insert(SysRole sysRole){
        sysRoleMapper.insert(sysRole);
    }

    public void update(SysRole sysRole){
        sysRoleMapper.update(sysRole);
    }

    public void delete(int id){
        sysRoleMapper.delete(id);
    }
}
