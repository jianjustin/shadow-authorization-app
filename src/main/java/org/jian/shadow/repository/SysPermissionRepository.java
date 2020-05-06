package org.jian.shadow.repository;

import org.jian.shadow.domain.SysPermission;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SysPermissionRepository extends CrudRepository<SysPermission, Integer>, PagingAndSortingRepository<SysPermission, Integer>{

}
