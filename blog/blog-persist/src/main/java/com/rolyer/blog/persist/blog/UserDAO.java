/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-4-22
 */
package com.rolyer.blog.persist.blog;

import java.util.Map;

import com.rolyer.blog.domain.blog.UserDO;

/**
 * 用户接口
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
public interface UserDAO {
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public Integer insertOneUser(UserDO user);
	/**
	 * 更新密码
	 * @param param 参数：<br/>
	 * 		account		账号<br/>
	 * 		password	密码<br/>
	 * @return
	 */
	public Integer updatePassword(Map<String, Object> param);
	/**
	 * 登陆
	 * @param param 参数：<br/>
	 * 		account		账号<br/>
	 * 		password	密码<br/>
	 * @return
	 */
	public Integer login(Map<String, Object> param);
}
