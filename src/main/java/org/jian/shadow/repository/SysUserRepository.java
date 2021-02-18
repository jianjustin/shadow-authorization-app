package org.jian.shadow.repository;

import java.util.Map;

import org.jian.shadow.domain.SysUser;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface SysUserRepository extends CrudRepository<SysUser, String>, PagingAndSortingRepository<SysUser, String>{

	public SysUser findByUsername(String username);
	
	@Query(value = "select a.*,c.role_id,c.role_name from sys_user a,sys_user_role b,sys_role c where a.user_id = b.user_id and b.role_id = c.role_id \n-- #pageable\n",
			countQuery = "select count(1) from sys_user",
			nativeQuery = true)
	public Page<Map<String, Object>> findAllList(Pageable pageable);
}
