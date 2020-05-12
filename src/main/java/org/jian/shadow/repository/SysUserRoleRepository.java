package org.jian.shadow.repository;

import java.util.List;

import org.jian.shadow.domain.SysUserRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SysUserRoleRepository extends CrudRepository<SysUserRole, Integer>, PagingAndSortingRepository<SysUserRole, Integer>{

	public List<SysUserRole> findByUserId(int id);
}
