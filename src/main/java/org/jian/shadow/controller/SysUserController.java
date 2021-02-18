package org.jian.shadow.controller;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.jian.shadow.common.PageInfo;
import org.jian.shadow.common.ResponseEntityInfo;
import org.jian.shadow.common.log.ShadowLog;
import org.jian.shadow.domain.SysUser;
import org.jian.shadow.domain.view.SimpleUserView;
import org.jian.shadow.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SysUserController {
    @Autowired
    public SysUserService sysUserService;

    @GetMapping("/sys/user")
    @PreAuthorize("hasAuthority('sys.user.query')")
    @ShadowLog(description = "查询用户")
    public ResponseEntityInfo<SysUser> findAll(){
    	List<SysUser> list = sysUserService.findAll();
    	ResponseEntityInfo<SysUser> res = new ResponseEntityInfo<SysUser>(HttpStatus.OK, null, list, null, null, "查询成功");
        return res;
    }
    
    @PostMapping("/sys/user/findAllByPage")
    @PreAuthorize("hasAuthority('sys.user.query')")
    @ShadowLog(description = "分页查询用户")
    public ResponseEntityInfo<SimpleUserView> findAllByPage(
    		@RequestBody PageInfo pageInfo){
    	Pageable pageable = PageRequest.of(pageInfo.getPage()-1, pageInfo.getSize());
    	Page<Map<String, Object>> data = sysUserService.findAllByPage(pageable);
    	pageInfo.setTotal(data.getTotalElements());
    	List<SimpleUserView> list = userMapToData(data.getContent());//数据转换
    	ResponseEntityInfo<SimpleUserView> res = new ResponseEntityInfo<SimpleUserView>(HttpStatus.OK, null, list, pageInfo, null, "分页查询成功");
        return res;
    }

    @GetMapping("/sys/user/{id}")
    @PreAuthorize("hasAuthority('sys.user.query')")
    @ShadowLog(description = "查询指定用户")
    public ResponseEntityInfo<SysUser> findOne(@PathVariable("id") String id){
    	SysUser sysUser = sysUserService.findOne(id);
    	ResponseEntityInfo<SysUser> res = new ResponseEntityInfo<SysUser>(HttpStatus.OK, sysUser, null, null, null, "用户查询成功");
        return res;
    }

    @PostMapping("/sys/user")
    @PreAuthorize("hasAuthority('sys.user.save')")
    @ShadowLog(description = "添加用户")
    public ResponseEntityInfo<SysUser> save(@RequestBody SysUser sysUser){
    	sysUser.setCreateDate(Timestamp.valueOf(LocalDateTime.now()));
    	sysUser = sysUserService.insert(sysUser);
        ResponseEntityInfo<SysUser> res = new ResponseEntityInfo<SysUser>(HttpStatus.OK, sysUser, null, null, null, "用户添加成功");
        return res;
    }

    @PutMapping("/sys/user")
    @PreAuthorize("hasAuthority('sys.user.update')")
    @ShadowLog(description = "修改用户信息")
    public ResponseEntityInfo<SysUser> update(@RequestBody SysUser sysUser){
    	sysUser = sysUserService.update(sysUser);
        ResponseEntityInfo<SysUser> res = new ResponseEntityInfo<SysUser>(HttpStatus.OK, sysUser, null, null, null, "用户修改成功");
        return res;
    }

    @DeleteMapping("/sys/user/{id}")
    @PreAuthorize("hasAuthority('sys.user.delete')")
    @ShadowLog(description = "删除指定用户")
    public ResponseEntityInfo<SysUser> delete(@PathVariable("id") String id){
    	SysUser oldSysUser = sysUserService.findOne(id);
    	sysUserService.delete(id);
        ResponseEntityInfo<SysUser> res = new ResponseEntityInfo<SysUser>(HttpStatus.OK, oldSysUser, null, null, null, "用户删除成功");
        return res;
    }
    
    
    private List<SimpleUserView> userMapToData(List<Map<String, Object>> dataMapList){
    	List<SimpleUserView> list = new ArrayList<>(dataMapList.size());
    	if(0 == dataMapList.size())return list;
    	
    	for (int i = 0; i < dataMapList.size(); i++) {
			SimpleUserView item = new SimpleUserView();
			item.setUserId((int)dataMapList.get(i).get("USER_ID"));
			item.setRoleId((int)dataMapList.get(i).get("ROLE_ID"));
			item.setRoleName((String)dataMapList.get(i).get("ROLE_NAME"));
			item.setUsername((String)dataMapList.get(i).get("USERNAME"));
			list.add(item);
		}
    	return list;
    }
}
