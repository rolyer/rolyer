/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-5-9
 */
package com.rolyer.blog.web.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.rolyer.blog.domain.CategoryDO;
import com.rolyer.blog.domain.CommentsDO;
import com.rolyer.blog.domain.LabelsDO;
import com.rolyer.blog.dto.ArticleDTO;
import com.rolyer.blog.dto.PageDto;
import com.rolyer.blog.page.PageDetails;
import com.rolyer.blog.service.blog.ArticleService;
import com.rolyer.blog.service.blog.CategoryService;
import com.rolyer.blog.service.blog.CommentService;
import com.rolyer.blog.service.blog.LabelsService;
import com.rolyer.blog.util.MD5Util;
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
	
	@Autowired
	private CommentService commentService;
	
	@RequestMapping
	public void index(Map<String, Object> out,ArticleDTO articleDTO,String p){
		if(p==null||!StringUtils.isNumber(p)){
			p="1";
		}
		//文章列表
		
		Integer totalRecords =articleService.queryArticleCount(articleDTO);
		
		PageDto page=new PageDto(); 
	 	page.setPageSize(10);
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
		PageDetails details = initPageDetails();
		details.setBodyClass("blog");
		out.put("details", details);
	}
	
	@RequestMapping
	public void view(Map<String, Object> out, String id){
		out.put("MD5", new MD5Util());
		if(StringUtils.isNotEmpty(id) && StringUtils.isNumber(id)){
			//Get article detail
			Integer _id = Integer.valueOf(id);
			ArticleDTO article =  articleService.queryArticleById(_id);
			out.put("article", article.getArticle());
			
			//Get comment
			List<CommentsDO> list = commentService.queryCommentByObjectId(_id);
			out.put("comments", list);
			out.put("count", list != null && list.size() >0 ? list.size() : 0);
		}
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
		//页面信息
		PageDetails details = initPageDetails();
		details.setBodyClass("services");
		out.put("details", details);
	}
	
	@RequestMapping
	public void portfolio(Map<String, Object> out){
		out.put("welcome","Welcome,this is Rolyer's blog!");
		//页面信息
		PageDetails details = initPageDetails();
		details.setBodyClass("portfolio");
		out.put("details", details);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ModelAndView addComment(CommentsDO comment, Map<String, Object> out) throws IOException {
		commentService.insertComment(comment);
		return printJs("alert('成功')", out);
	}
}
