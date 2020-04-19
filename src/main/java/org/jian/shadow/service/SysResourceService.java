package org.jian.shadow.service;

import org.jian.shadow.domain.SysResource;
import org.jian.shadow.mapper.SysResourceMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysResourceService {
    @Autowired
    public SysResourceMapper sysResourceMapper;

    public List<SysResource> findAll(){
        return sysResourceMapper.findAll();
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
