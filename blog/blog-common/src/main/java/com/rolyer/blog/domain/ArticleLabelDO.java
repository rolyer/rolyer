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
public class ArticleLabelDO implements java.io.Serializable {

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;					//编号
	private Integer articleId;			//文章ID
	private Integer labelId;			//标签ID
	
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
	 * @return the labelId
	 */
	public Integer getLabelId() {
		return labelId;
	}
	/**
	 * @param labelId the labelId to set
	 */
	public void setLabelId(Integer labelId) {
		this.labelId = labelId;
	}
}
