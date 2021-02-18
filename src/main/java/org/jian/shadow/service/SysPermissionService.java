package org.jian.shadow.service;

import java.util.ArrayList;
import java.util.List;

import org.jian.shadow.domain.SysPermission;
import org.jian.shadow.repository.SysPermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SysPermissionService {
	@Autowired
    public SysPermissionRepository sysPermissionRepository;

    public List<SysPermission> findAll(){
    	Iterable<SysPermission> iterable = sysPermissionRepository.findAll();
    	List<SysPermission> result = new ArrayList<>();
        iterable.forEach(result::add);
        return result;
    }
    
    public List<SysPermission> findAllByRole(List<String> roleIds){
    	return (List<SysPermission>) sysPermissionRepository.findAllById(roleIds);
    }
    
    public List<SysPermission> findAllByPage(Pageable pageable){
        return sysPermissionRepository.findAll(pageable).getContent();
    }

    public SysPermission findOne(String id){
        return sysPermissionRepository.findById(id).get();
    }

    public void save(SysPermission sysPermission){
    	sysPermissionRepository.save(sysPermission);
    }
    
    public void saveAll(List<SysPermission> sysPermissions){
    	sysPermissionRepository.saveAll(sysPermissions);
    }

    public void update(SysPermission sysPermission){
    	sysPermissionRepository.save(sysPermission);
    }

    public void delete(String id){
    	sysPermissionRepository.deleteById(id);
    }
}
