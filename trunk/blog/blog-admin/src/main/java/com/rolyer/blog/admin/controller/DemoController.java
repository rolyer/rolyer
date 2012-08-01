/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-9-5 下午06:51:19
 */
package com.rolyer.blog.admin.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
@Controller
public class DemoController extends BaseController {
	
	@RequestMapping
	public void index(Map<String, Object> model){
		model.put("msg", "Successful：这是一个测试。");
	}
	
	@RequestMapping
	public void home(Map<String, Object> model){
		model.put("msg", "Successful：这是一个测试。");
	}
	
	@RequestMapping
	public void music(){}
}
