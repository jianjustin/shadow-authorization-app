package org.jian.shadow.service;

import org.jian.shadow.domain.SysResource;
import org.jian.shadow.domain.SysUser;
import org.jian.shadow.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserService {
    @Autowired
    public SysUserMapper sysUserMapper;

    public List<SysUser> findAll(){
        return sysUserMapper.findAll();
    }

    public SysUser findOne(int id){
        return sysUserMapper.findOne(id);
    }
    
    public SysUser findByUserName(String username){
        return sysUserMapper.findByUserName(username);
    }

    public void insert(SysUser sysUser){
        sysUserMapper.insert(sysUser);
    }

    public void update(SysUser sysUser){
        sysUserMapper.update(sysUser);
    }

    public void delete(int id){
        sysUserMapper.delete(id);
    }

	public List<SysResource> findAuthorityByUser(int id) {
		return sysUserMapper.findAuthorityByUser(id);
	}
}
