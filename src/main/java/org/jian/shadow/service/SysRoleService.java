package org.jian.shadow.service;

import java.util.ArrayList;
import java.util.List;

import org.jian.shadow.domain.SysRole;
import org.jian.shadow.repository.SysRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
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
    
    public List<SysRole> findAllByPage(Pageable pageable){
    	List<SysRole> list = sysRoleRepository.findAll(pageable).getContent();
        return list;
    }

    public SysRole findOne(int id){
        return sysRoleRepository.findById(id).get();
    }

    public void insert(SysRole sysRole){
    	sysRoleRepository.save(sysRole);
    }

    public void update(SysRole sysRole){
    	sysRoleRepository.save(sysRole);
    }

    public void delete(int id){
    	sysRoleRepository.deleteById(id);
    }
}
