/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-4-24
 */
package com.rolyer.blog.service.user.impl;

import java.sql.SQLException;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.rolyer.blog.domain.blog.UserDO;
import com.rolyer.blog.service.BaseServiceTestCase;
import com.rolyer.blog.service.blog.UserService;


/**
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
public class UserServiceImplTest extends BaseServiceTestCase {
	@Autowired
	private UserService userService;
	
	public  void test_insert_one_user() {
		clean();
		Integer imp=userService.insertOneUser(getUserDO());
		assertTrue("the id is "+imp.toString(), imp.intValue()>0);
	}
	
	public UserDO getUserDO() {
		UserDO user=new UserDO();
		user.setAccount("account");
		user.setPassword("r7877d8f6sa8f");
		user.setGmtCreated(new Date());
		user.setGmtModified(new Date());
		
		return user;
	}
	
	public void clean() {
		try {
			connection.prepareStatement("").execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
