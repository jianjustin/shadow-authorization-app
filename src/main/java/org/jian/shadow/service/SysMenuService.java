package org.jian.shadow.service;

import org.jian.shadow.entity.SysMenu;
import org.jian.shadow.mapper.SysMenuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysMenuService {
    @Autowired
    public SysMenuMapper sysMenuMapper;

    public List<SysMenu> findAll(){
        return sysMenuMapper.findAll();
    }

    public SysMenu findOne(int id){
        return sysMenuMapper.findOne(id);
    }

    public void insert(SysMenu sysMenu){
        sysMenuMapper.insert(sysMenu);
    }

    public void update(SysMenu sysMenu){
        sysMenuMapper.update(sysMenu);
    }

    public void delete(int id){
        sysMenuMapper.delete(id);
    }
}
