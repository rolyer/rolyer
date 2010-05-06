/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-5-4
 */
package com.rolyer.blog.dto;

import com.rolyer.blog.domain.blog.ArticleDO;

/**
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
public class ArticleDTO implements java.io.Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private ArticleDO article;
	private String categoryName;
	
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
