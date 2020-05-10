package org.jian.shadow.security;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.jian.shadow.domain.SysPermission;
import org.jian.shadow.domain.SysResource;
import org.jian.shadow.domain.SysUser;
import org.jian.shadow.domain.SysUserRole;
import org.jian.shadow.repository.SysPermissionRepository;
import org.jian.shadow.repository.SysUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Component("userDetailsService")
public class UserModelDetailsService implements UserDetailsService {
    @Autowired
    public SysUserRepository sysUserRepository;
    @Autowired
    public SysPermissionRepository sysPermissionRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        SysUser user = sysUserRepository.findByUsername(s);//查询系统用户
        if (null == user)throw new UsernameNotFoundException("用户账户【"+s+"】查询失败");
        
        List<Integer> roleIds = user.getRoles().stream().map(SysUserRole::getRoleId).collect(Collectors.toList());
		Set<SysPermission> sysPermissions = new HashSet<>();
		for (int i = 0; i < roleIds.size(); i++) {
			sysPermissions.addAll(sysPermissionRepository.findAllByRoleId(roleIds.get(i)));
		}
        return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),sysPermissions.stream()
                .map(sysPermission -> new CustomGrantedAuthority(sysPermission.getResource()))
                .collect(Collectors.toList()));
    }

    class CustomGrantedAuthority implements GrantedAuthority {
		private static final long serialVersionUID = 1L;
		private SysResource authority;
        public CustomGrantedAuthority(){}
        public CustomGrantedAuthority(SysResource authority){
            this.authority = authority;
        }
        @Override
        public String getAuthority() {
            return authority.getResourceOperation();
        }
    }

}
