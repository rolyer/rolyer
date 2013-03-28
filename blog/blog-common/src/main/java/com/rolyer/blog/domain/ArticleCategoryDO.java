/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-5-2
 */
package com.rolyer.blog.domain;

/**
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
public class ArticleCategoryDO implements java.io.Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;					//编号
	private Integer articleId;			//文章ID
	private Integer categoryId;			//类别ID
	
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the articleId
	 */
	public Integer getArticleId() {
		return articleId;
	}
	/**
	 * @param articleId the articleId to set
	 */
	public void setArticleId(Integer articleId) {
		this.articleId = articleId;
	}
	/**
	 * @return the categoryId
	 */
	public Integer getCategoryId() {
		return categoryId;
	}
	/**
	 * @param categoryId the categoryId to set
	 */
	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}
}
