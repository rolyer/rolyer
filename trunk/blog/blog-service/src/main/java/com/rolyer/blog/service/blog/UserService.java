/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-4-24
 */
package com.rolyer.blog.service.blog;

import com.rolyer.blog.domain.blog.UserDO;

/**
 * 用户服务接口
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
public interface UserService {
	/**
	 * 添加用户
	 * @param user
	 * @return
	 */
	public Integer insertOneUser(UserDO user);
}
