package org.jian.shadow.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.jian.shadow.domain.SysResource;
import org.jian.shadow.repository.SysResourceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class SysResourceService {
	@Autowired
    public SysResourceRepository sysResourceRepository;

    public List<SysResource> findAll(){
    	Iterable<SysResource> iterable = sysResourceRepository.findAll();
    	List<SysResource> result = new ArrayList<>();
        iterable.forEach(result::add);
        return result;
    }
    
    
    public Page<SysResource> findAllByPage(Pageable pageable){
        return sysResourceRepository.findAll(pageable);
    }

    public SysResource findOne(String id){
        return sysResourceRepository.findById(id).get();
    }

    public SysResource insert(SysResource sysResource){
        sysResource.setResourceId(UUID.randomUUID().toString());
    	return sysResourceRepository.save(sysResource);
    }

    public SysResource update(SysResource sysResource){
    	return sysResourceRepository.save(sysResource);
    }

    public void delete(String id){
    	sysResourceRepository.deleteById(id);
    }
}
