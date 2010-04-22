/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-4-22
 */
package com.rolyer.blog.persist.user.impl;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;

import com.rolyer.blog.domain.user.UserDO;
import com.rolyer.blog.persist.BaseDaoTestCase;
import com.rolyer.blog.persist.user.UserDAO;


/**
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
public class UserDaoImplTest extends BaseDaoTestCase{
	@Autowired
	private UserDAO userDAO;
	
	public void test_insert_one_user(){
		Integer ipm=userDAO.insertOneUser(getUserDO());
		assertEquals("the id is "+ipm.toString(), 2, ipm.intValue());
	}
	
	public UserDO getUserDO() {
		UserDO user=new UserDO();
		user.setAccount("account");
		user.setPassword("r7877d8f6sa8f");
		user.setGmtCreated(new Date());
		user.setGmtModified(new Date());
		
		return user;
	}
}
