package org.jian.shadow.repository;

import org.jian.shadow.domain.SysResource;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SysResourceRepository extends CrudRepository<SysResource, String>, PagingAndSortingRepository<SysResource, String>{

}
