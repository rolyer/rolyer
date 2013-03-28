/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-6-8
 */
package com.rolyer.blog.persist.blog.impl;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Controller;
import org.springframework.util.Assert;

import com.rolyer.blog.domain.InformationDO;
import com.rolyer.blog.persist.blog.InformationDAO;

/**
 * 我的信息接口实现类
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
@Controller("informationDAO")
public class InformationDAOImpl extends SqlMapClientDaoSupport implements InformationDAO {

	public InformationDO queryFirstInformation() {
		return (InformationDO) getSqlMapClientTemplate().queryForObject("information.queryFirstInformation");
	}

	public Integer updateInformationAboutMe(InformationDO information) {
		Assert.notNull(information, "the object of must not be null");
		Assert.hasText(information.getAboutMe(), "the AboutMe must not be empty");
		return getSqlMapClientTemplate().update("information.updateInformationAboutMe", information);
	}

	public Integer updateInformationContactMe(InformationDO information) {
		Assert.notNull(information, "the object of must not be null");
		Assert.hasText(information.getContactMe(), "the ContactMe must not be empty");
		return getSqlMapClientTemplate().update("information.updateInformationContactMe", information);
	}

}
