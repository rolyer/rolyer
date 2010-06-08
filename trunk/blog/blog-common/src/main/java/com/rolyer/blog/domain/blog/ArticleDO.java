/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-5-2
 */
package com.rolyer.blog.domain.blog;

import java.util.Date;

/**
 * 文章实体类
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
public class ArticleDO implements java.io.Serializable {

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;				//编号
	private Integer categoryId;		//类别编号
	private String title;			//标题
	private String content;			//内容
	private Integer showMaxLength;	//文章显示长度（默认500）
	private Integer views;			//浏览次数
	private Integer commentsNumber;	//评论数
	private Date gmtCreated;		//创建时间
	private Date gmtModified;		//修改时间
	
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
	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}
	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}
	/**
	 * @return the content
	 */
	public String getContent() {
		return content;
	}
	/**
	 * @param content the content to set
	 */
	public void setContent(String content) {
		this.content = content;
	}
	/**
	 * @return the showMaxLength
	 */
	public Integer getShowMaxLength() {
		return showMaxLength;
	}
	/**
	 * @param showMaxLength the showMaxLength to set
	 */
	public void setShowMaxLength(Integer showMaxLength) {
		this.showMaxLength = showMaxLength;
	}
	/**
	 * @return the views
	 */
	public Integer getViews() {
		return views;
	}
	/**
	 * @param views the views to set
	 */
	public void setViews(Integer views) {
		this.views = views;
	}
	/**
	 * @return the commentsNumber
	 */
	public Integer getCommentsNumber() {
		return commentsNumber;
	}
	/**
	 * @param commentsNumber the commentsNumber to set
	 */
	public void setCommentsNumber(Integer commentsNumber) {
		this.commentsNumber = commentsNumber;
	}
	/**
	 * @return the gmtCreated
	 */
	public Date getGmtCreated() {
		return gmtCreated;
	}
	/**
	 * @param gmtCreated the gmtCreated to set
	 */
	public void setGmtCreated(Date gmtCreated) {
		this.gmtCreated = gmtCreated;
	}
	/**
	 * @return the gmtModified
	 */
	public Date getGmtModified() {
		return gmtModified;
	}
	/**
	 * @param gmtModified the gmtModified to set
	 */
	public void setGmtModified(Date gmtModified) {
		this.gmtModified = gmtModified;
	}
}
