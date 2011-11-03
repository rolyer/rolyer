/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-5-11
 */
package com.rolyer.blog.web.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rolyer.blog.domain.blog.InformationDO;
import com.rolyer.blog.page.PageDetails;
import com.rolyer.blog.service.blog.InformationService;

/**
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
@Controller
public class ContactController extends BaseController {
	@Autowired
	private InformationService informationService;
	
	/**
	 * 获取我的联系信息
	 * @param out
	 */
	@RequestMapping
	public void index(Map<String, Object> out) {
		InformationDO informationDO = informationService.queryFirstInformation();
		
		out.put("contactme", informationDO.getContactMe());
		//页面信息
		PageDetails details = initPageDetails();
		details.setBodyClass("contact");
		out.put("details", details);
	}
}
