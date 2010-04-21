/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-4-22
 */
package com.rolyer.blog.persist.user;

import com.rolyer.blog.domain.user.UserDO;

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
}
