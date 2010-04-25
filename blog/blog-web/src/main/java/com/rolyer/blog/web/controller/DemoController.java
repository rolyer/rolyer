/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-4-24
 */
package com.rolyer.blog.web.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
@Controller
public class DemoController extends BaseController {
//	@Autowired
//	private UserService userService;
	
	@RequestMapping
	public void index(Map<String, Object> out){
		out.put("json", "Hello Rolyer！");
		//return new ModelAndView("json");
	}
}
