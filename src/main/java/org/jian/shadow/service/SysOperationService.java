package org.jian.shadow.service;

import org.jian.shadow.entity.SysOperation;
import org.jian.shadow.mapper.SysOperationMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysOperationService {
    @Autowired
    public SysOperationMapper sysOperationMapper;

    public List<SysOperation> findAll(){
        return sysOperationMapper.findAll();
    }

    public SysOperation findOne(int id){
        return sysOperationMapper.findOne(id);
    }

    public void insert(SysOperation sysOperation){
        sysOperationMapper.insert(sysOperation);
    }

    public void update(SysOperation sysOperation){
        sysOperationMapper.update(sysOperation);
    }

    public void delete(int id){
        sysOperationMapper.delete(id);
    }
}
