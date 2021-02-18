package org.jian.shadow.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.jian.shadow.domain.SysUser;
import org.jian.shadow.repository.SysUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SysUserService {
    @Autowired
    public SysUserRepository sysUserRepository;

    public List<SysUser> findAll(){
    	Iterable<SysUser> iterable = sysUserRepository.findAll();
    	List<SysUser> result = new ArrayList<>();
        iterable.forEach(result::add);
        return result;
    }
    
    public Page<Map<String, Object>> findAllByPage(Pageable pageable){
        return sysUserRepository.findAllList(pageable);
    }

    public SysUser findOne(String id){
        return sysUserRepository.findById(id).get();
    }
    
    public SysUser findByUserName(String username){
        return sysUserRepository.findByUsername(username);
    }

    public SysUser insert(SysUser sysUser){
        sysUser.setUserId(UUID.randomUUID().toString());
    	return sysUserRepository.save(sysUser);
    }

    public SysUser update(SysUser sysUser){
    	return sysUserRepository.save(sysUser);
    }

    public void delete(String id){
    	sysUserRepository.deleteById(id);
    }

}
