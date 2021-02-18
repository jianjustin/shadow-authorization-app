package org.jian.shadow.repository;

import org.jian.shadow.domain.SysRole;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SysRoleRepository extends CrudRepository<SysRole, String>, PagingAndSortingRepository<SysRole, String>{

}
