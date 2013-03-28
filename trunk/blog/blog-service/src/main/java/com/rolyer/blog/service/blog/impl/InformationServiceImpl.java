/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-6-8
 */
package com.rolyer.blog.service.blog.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.rolyer.blog.domain.InformationDO;
import com.rolyer.blog.persist.blog.InformationDAO;
import com.rolyer.blog.service.blog.InformationService;

/**
 * 我的信息接口实现类
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
@Controller("informationService")
public class InformationServiceImpl implements InformationService {
	@Autowired
	private InformationDAO informationDAO;

	public InformationDO queryFirstInformation() {
		return informationDAO.queryFirstInformation();
	}

	public Integer updateInformationAboutMe(InformationDO information) {
		return informationDAO.updateInformationAboutMe(information);
	}

	public Integer updateInformationContactMe(InformationDO information) {
		return informationDAO.updateInformationContactMe(information);
	}

}
