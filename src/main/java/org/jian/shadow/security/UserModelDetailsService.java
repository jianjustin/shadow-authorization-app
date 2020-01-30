package org.jian.shadow.security;

import org.jian.shadow.entity.SysUser;
import org.jian.shadow.mapper.SysUserMapper;
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
    public SysUserMapper sysUserMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        SysUser user = sysUserMapper.findByUserName(s);//查询系统用户
        if (null == user)throw new UsernameNotFoundException("用户账户【"+s+"】查询失败");

        //查询系统用户角色
        List<Integer> roles = sysUserMapper.findRolesByUserName(s);
        if (null == roles || roles.size() == 0) return new org.springframework.security.core.userdetails.User(user.username,user.password,null);

        //查询系统用户权限
        List<String> authorities = new ArrayList<>();
        for (int i = 0; i < roles.size(); i++)
            authorities.addAll(sysUserMapper.findAuthorityByRole(roles.get(i)));

        return new org.springframework.security.core.userdetails.User(user.username,user.password,authorities.stream()
                .map(authority -> new CustomGrantedAuthority(authority))
                .collect(Collectors.toList()));
    }

    class CustomGrantedAuthority implements GrantedAuthority {
        private String authority;
        public CustomGrantedAuthority(){}
        public CustomGrantedAuthority(String authority){
            this.authority = authority;
        }
        @Override
        public String getAuthority() {
            return authority;
        }
    }

}
