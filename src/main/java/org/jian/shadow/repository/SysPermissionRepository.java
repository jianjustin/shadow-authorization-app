package org.jian.shadow.repository;

import java.util.List;

import org.jian.shadow.domain.SysPermission;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SysPermissionRepository extends CrudRepository<SysPermission, Integer>, PagingAndSortingRepository<SysPermission, Integer>{

	public List<SysPermission> findByRoleIdIn(List<Integer> list);
}
