/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-4-22
 */
package com.rolyer.blog.persist.user.impl;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Component;

import com.rolyer.blog.domain.user.UserDO;
import com.rolyer.blog.persist.user.UserDAO;

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
}
