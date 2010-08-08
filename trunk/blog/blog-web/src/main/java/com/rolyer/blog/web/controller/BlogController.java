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
import com.rolyer.blog.dto.ArticleDTO;
import com.rolyer.blog.dto.PageDto;
import com.rolyer.blog.service.blog.ArticleService;
import com.rolyer.blog.service.blog.CategoryService;
import com.rolyer.blog.service.blog.LabelsService;
import com.rolyer.blog.util.StringUtils;

/**
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
@Controller
public class BlogController extends BaseController {

	@Autowired
	private ArticleService articleService;
	
	@Autowired
	private LabelsService labelsService;
	
	@Autowired
	private CategoryService categoryService;
	
	
	
	@RequestMapping
	public void index(Map<String, Object> out,ArticleDTO articleDTO,String p){
		if(p==null||!StringUtils.isNumber(p)){
			p="1";
		}
		//文章列表
		
		Integer totalRecords =articleService.queryArticleCount(articleDTO);
		
		PageDto page=new PageDto(); 
	 	page.setPageSize(9);
	 	page.setSort("gmt_modified");
	 	page.setDir("DESC");
	 	int start=(Integer.valueOf(p)-1)*page.getPageSize();
	 	page.setStartIndex(start);
	 	Integer totalPages = totalRecords / page.getPageSize() + 1;
	 	if (totalRecords % page.getPageSize() == 0) {
	 		totalPages--;
	 	}
	 	articleDTO.setPage(page);
	 	List<ArticleDTO> list = articleService.queryArticleList(articleDTO);
		
	 	out.put("totalPage", totalPages);
		out.put("currentPage", Integer.valueOf(p));
		
		out.put("suffixUrl", "");
		out.put("results", list);
	 	
	 	//标签
		List<LabelsDO> labelsList = labelsService.queryLabelsList();
		out.put("labelsList",labelsList);
		//类别
		List<CategoryDO> categoryList = categoryService.queryCategoryList();
		out.put("categoryList",categoryList);
		//页面信息
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
