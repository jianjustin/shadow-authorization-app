package org.jian.shadow.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.jian.shadow.domain.SysRole;
import org.jian.shadow.repository.SysRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SysRoleService {
	@Autowired
    public SysRoleRepository sysRoleRepository;

    public List<SysRole> findAll(){
    	Iterable<SysRole> iterable = sysRoleRepository.findAll();
    	List<SysRole> result = new ArrayList<>();
        iterable.forEach(result::add);
        return result;
    }
    
    
    public Page<SysRole> findAllByPage(Pageable pageable){
    	return sysRoleRepository.findAll(pageable);
    }

    public SysRole findOne(String id){
        return sysRoleRepository.findById(id).get();
    }

    public SysRole insert(SysRole sysRole){
        sysRole.setRoleId(UUID.randomUUID().toString());
    	return sysRoleRepository.save(sysRole);
    }

    public SysRole update(SysRole sysRole){
    	return sysRoleRepository.save(sysRole);
    }

    public void delete(String id){
    	sysRoleRepository.deleteById(id);
    }
}
