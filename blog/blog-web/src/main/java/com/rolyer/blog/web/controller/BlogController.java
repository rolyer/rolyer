/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-4-24
 */
package com.rolyer.blog.web.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
@Controller
public class BlogController extends BaseController {
//	@Autowired
//	private UserService userService;
	
	@RequestMapping
	public ModelAndView demo(Map<String, Object> out){
		out.put("json", "Hello Rolyer！");
		return new ModelAndView("json");
	}
}
