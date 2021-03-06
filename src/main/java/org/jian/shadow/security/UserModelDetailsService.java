package org.jian.shadow.security;

import java.util.List;
import java.util.stream.Collectors;

import org.jian.shadow.domain.SysPermission;
import org.jian.shadow.domain.SysResource;
import org.jian.shadow.domain.SysUser;
import org.jian.shadow.domain.SysUserRole;
import org.jian.shadow.repository.SysPermissionRepository;
import org.jian.shadow.repository.SysResourceRepository;
import org.jian.shadow.repository.SysUserRepository;
import org.jian.shadow.repository.SysUserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserModelDetailsService implements UserDetailsService {
    @Autowired
    public SysUserRepository sysUserRepository;
    @Autowired
    public SysPermissionRepository sysPermissionRepository;
    @Autowired
    public SysUserRoleRepository sysUserRoleRepository;
    @Autowired
    public SysResourceRepository sysResourceRepository;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        SysUser user = sysUserRepository.findByUsername(s);//查询系统用户
        if (null == user)throw new UsernameNotFoundException("用户账户【"+s+"】查询失败");
        
        List<Integer> roleIds = sysUserRoleRepository.findByUserId(user.getUserId()).stream().map(SysUserRole::getRoleId).collect(Collectors.toList());
		
        List<SysPermission> sysPermissions = sysPermissionRepository.findByRoleIdIn(roleIds);
        List<Integer> resourceIds = sysPermissions.stream().map(SysPermission::getResourceId).collect(Collectors.toList());
        List<SysResource> sysReources = (List<SysResource>) sysResourceRepository.findAllById(resourceIds);

        return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),sysReources.stream()
                .map(sysReource -> new CustomGrantedAuthority(sysReource))
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
