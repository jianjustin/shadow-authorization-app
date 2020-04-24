package org.jian.shadow.service;

import java.util.List;

import org.jian.shadow.common.PageInfo;
import org.jian.shadow.domain.SysResource;
import org.jian.shadow.mapper.SysResourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysResourceService {
    @Autowired
    public SysResourceMapper sysResourceMapper;

    public List<SysResource> findAll(){
        return sysResourceMapper.findAll();
    }

    public List<SysResource> findAllByPage(PageInfo pageInfo){
        return sysResourceMapper.findAllByPage(pageInfo.getOffset(), pageInfo.getLimit());
    }
    
    public SysResource findOne(int id){
        return sysResourceMapper.findOne(id);
    }

    public void insert(SysResource sysResource){
        sysResourceMapper.insert(sysResource);
    }

    public void update(SysResource sysResource){
        sysResourceMapper.update(sysResource);
    }

    public void delete(int id){
        sysResourceMapper.delete(id);
    }
}
