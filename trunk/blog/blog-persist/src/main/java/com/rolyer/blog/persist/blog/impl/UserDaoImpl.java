/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-4-22
 */
package com.rolyer.blog.persist.blog.impl;

import java.util.Map;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Component;

import com.rolyer.blog.domain.UserDO;
import com.rolyer.blog.persist.blog.UserDAO;

/**
 * 用户接口实现类
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
@Component("userDAO")
public class UserDaoImpl extends SqlMapClientDaoSupport implements UserDAO{

	public Integer insertOneUser(UserDO user) {
		return (Integer) getSqlMapClientTemplate().insert("sqlMapUser.insertOneUser", user);
	}

	public Integer login(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return null;
	}

	public Integer updatePassword(Map<String, Object> param) {
		// TODO Auto-generated method stub
		return null;
	}
}
