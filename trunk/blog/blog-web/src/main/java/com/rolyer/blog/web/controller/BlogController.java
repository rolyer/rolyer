/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-5-9
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
public class BlogController extends BaseController {
	@RequestMapping
	public void index(Map<String, Object> out){
		out.put("welcome","Welcome,this is Rolyer's blog!");
	}
	
	@RequestMapping
	public void view(Map<String, Object> out){
		out.put("welcome","Welcome,this is Rolyer's blog!");
	}
	
	@RequestMapping
	public void about(Map<String, Object> out){
		out.put("welcome","Welcome,this is Rolyer's blog!");
	}
	
	@RequestMapping
	public void contact(Map<String, Object> out){
		out.put("welcome","Welcome,this is Rolyer's blog!");
	}
	
	@RequestMapping
	public void testimonials(Map<String, Object> out){
		out.put("welcome","Welcome,this is Rolyer's blog!");
	}
	@RequestMapping
	public void services(Map<String, Object> out){
		out.put("welcome","Welcome,this is Rolyer's blog!");
	}
	
	@RequestMapping
	public void portfolio(Map<String, Object> out){
		out.put("welcome","Welcome,this is Rolyer's blog!");
	}
}
