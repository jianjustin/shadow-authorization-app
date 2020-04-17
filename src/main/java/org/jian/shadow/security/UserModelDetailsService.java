package org.jian.shadow.security;

import org.jian.shadow.entity.SysResource;
import org.jian.shadow.entity.SysUser;
import org.jian.shadow.entity.SysUserRole;
import org.jian.shadow.mapper.SysUserMapper;
import org.jian.shadow.service.ISysUserRoleService;
import org.jian.shadow.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component("userDetailsService")
public class UserModelDetailsService implements UserDetailsService {
    @Autowired
    public ISysUserService sysUserService;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        SysUser user = sysUserService.findByUserName(s);//查询系统用户
        if (null == user)throw new UsernameNotFoundException("用户账户【"+s+"】查询失败");

        //查询系统用户角色
        List<SysUserRole> roles = sysUserService.findRolesByUserId(user.getId());
        if (null == roles || roles.size() == 0) return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),null);

        //查询系统用户权限
        List<Integer> ids = roles.stream().map(SysUserRole::getRoleId).collect(Collectors.toList());
        List<SysResource> authorities = sysUserService.findAuthorityByRole(ids);

        return new org.springframework.security.core.userdetails.User(user.getUsername(),user.getPassword(),authorities.stream()
                .map(authority -> new CustomGrantedAuthority(authority))
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
