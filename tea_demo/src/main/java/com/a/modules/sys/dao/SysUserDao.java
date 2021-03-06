
package com.a.modules.sys.dao;

import java.util.List;

import com.a.modules.sys.entity.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

/**
 * 系统用户
 *
 */
public interface SysUserDao extends BaseMapper<SysUser> {
	
	/**
	 * 查询用户的所有权限
	 * @param userId  用户ID
	 */
	String AqueryAllPerms(Long userId);
	
	

	List<String> AqueryAllPermsOfGOD();
	
	
	/**
	 * 查询用户的所有菜单ID
	 */
	List<Long> AqueryAllMenuId(Long userId);

}
