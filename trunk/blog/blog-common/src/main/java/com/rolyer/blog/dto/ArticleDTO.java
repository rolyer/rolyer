/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-5-4
 */
package com.rolyer.blog.dto;

import com.rolyer.blog.domain.blog.ArticleDO;
import com.rolyer.blog.domain.blog.CategoryDO;
import com.rolyer.blog.domain.blog.LabelsDO;

/**
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
public class ArticleDTO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private PageDto page;
	private ArticleDO article;
	private CategoryDO category;
	private LabelsDO labels;
	private String categoryName;
	
	/**
	 * @return the page
	 */
	public PageDto getPage() {
		return page;
	}
	/**
	 * @param page the page to set
	 */
	public void setPage(PageDto page) {
		this.page = page;
	}
	/**
	 * @return the article
	 */
	public ArticleDO getArticle() {
		return article;
	}
	/**
	 * @param article the article to set
	 */
	public void setArticle(ArticleDO article) {
		this.article = article;
	}
	/**
	 * @return the category
	 */
	public CategoryDO getCategory() {
		return category;
	}
	/**
	 * @param category the category to set
	 */
	public void setCategory(CategoryDO category) {
		this.category = category;
	}
	/**
	 * @return the labels
	 */
	public LabelsDO getLabels() {
		return labels;
	}
	/**
	 * @param labels the labels to set
	 */
	public void setLabels(LabelsDO labels) {
		this.labels = labels;
	}
	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}
	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
}
