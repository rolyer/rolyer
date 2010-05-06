/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-4-24
 */
package com.rolyer.blog.service.blog.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.rolyer.blog.domain.blog.UserDO;
import com.rolyer.blog.persist.blog.UserDAO;
import com.rolyer.blog.service.blog.UserService;

/**
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
@Component("userService")
public class UserServiceImpl implements UserService {
	

	@Autowired
	private UserDAO userDAO;
	
	public Integer insertOneUser(UserDO user) {
		return userDAO.insertOneUser(user);
	}

}
