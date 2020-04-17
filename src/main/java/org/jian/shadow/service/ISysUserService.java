package org.jian.shadow.service;

import org.jian.shadow.entity.SysResource;
import org.jian.shadow.entity.SysUser;
import com.baomidou.mybatisplus.extension.service.IService;
import org.jian.shadow.entity.SysUserRole;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author jian
 * @since 2020-04-17
 */
public interface ISysUserService extends IService<SysUser> {

    public SysUser findByUserName(String username);

    public List<SysUserRole> findRolesByUserId(int id);

    public List<SysResource> findAuthorityByRole(List<Integer> ids);

}
