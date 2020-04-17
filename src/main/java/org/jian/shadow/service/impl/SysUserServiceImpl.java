package org.jian.shadow.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.jian.shadow.entity.SysPermission;
import org.jian.shadow.entity.SysResource;
import org.jian.shadow.entity.SysUser;
import org.jian.shadow.entity.SysUserRole;
import org.jian.shadow.mapper.SysPermissionMapper;
import org.jian.shadow.mapper.SysResourceMapper;
import org.jian.shadow.mapper.SysUserMapper;
import org.jian.shadow.mapper.SysUserRoleMapper;
import org.jian.shadow.service.ISysUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author jian
 * @since 2020-04-17
 */
@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements ISysUserService {
    @Autowired
    public SysUserMapper sysUserMapper;
    @Autowired
    public SysUserRoleMapper sysUserRoleMapper;
    @Autowired
    public SysPermissionMapper sysPermissionMapper;
    @Autowired
    public SysResourceMapper sysResourceMapper;

    @Override
    public SysUser findByUserName(String username) {
        QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("username",username);
        return sysUserMapper.selectOne(queryWrapper);
    }

    @Override
    public List<SysUserRole> findRolesByUserId(int id){
        QueryWrapper<SysUserRole> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id",id);
        return sysUserRoleMapper.selectList(queryWrapper);
    }

    public List<SysResource> findAuthorityByRole(List<Integer> ids){
        QueryWrapper<SysPermission> queryWrapper = new QueryWrapper<>();
        queryWrapper.in("role_id",ids);
        List<SysPermission> list = sysPermissionMapper.selectList(queryWrapper);

        if(null == list || list.size() == 0)return Collections.emptyList();

        List<Integer> list1 = list.stream().map(SysPermission::getResourceId).collect(Collectors.toList());
        QueryWrapper<SysResource> queryWrapper1 = new QueryWrapper<>();
        queryWrapper1.in("id",list1);
        return sysResourceMapper.selectList(queryWrapper1);
    }
}
