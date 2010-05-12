/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-5-9
 */
package com.rolyer.blog.web.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.rolyer.blog.domain.blog.CategoryDO;
import com.rolyer.blog.domain.blog.LabelsDO;
import com.rolyer.blog.service.blog.CategoryService;
import com.rolyer.blog.service.blog.LabelsService;

/**
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
@Controller
public class BlogController extends BaseController {
	
//	@Autowired
//	private ArticleService articleService;
	
	@Autowired
	private LabelsService labelsService;
	
	@Autowired
	private CategoryService categoryService;
	
	
	
	@RequestMapping
	public void index(Map<String, Object> out){
		
		
		List<LabelsDO> labelsList = labelsService.queryLabelsList();
		out.put("labelsList",labelsList);
		
		List<CategoryDO> categoryList = categoryService.queryCategoryList();
		out.put("categoryList",categoryList);
		
		out.put("whereiam", "blog");
		out.put("pageTitle", "Rolyer's Blog - over webdesign");
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
