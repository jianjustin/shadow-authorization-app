package org.jian.shadow.repository;

import java.util.List;

import org.jian.shadow.domain.SysUserRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SysUserRoleRepository extends CrudRepository<SysUserRole, String>, PagingAndSortingRepository<SysUserRole, String>{

	public List<SysUserRole> findByUserId(String id);
}
