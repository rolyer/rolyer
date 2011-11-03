/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2011-11-02
 */
package com.rolyer.blog.page;

/**
 * @author Rolyer (rolyer.live@gmail.com)
 * 
 */
public class PageDetails {
	
	private String title;
	private String keywords;
	private String description;
	private String bodyClass = "home";
	
	public PageDetails() {
		super();
	}
	
	public PageDetails(String title, String keywords, String description,
			String bodyClass) {
		super();
		this.title = title;
		this.keywords = keywords;
		this.description = description;
		this.bodyClass = bodyClass;
	}
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getKeywords() {
		return keywords;
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getBodyClass() {
		return bodyClass;
	}

	public void setBodyClass(String bodyClass) {
		this.bodyClass = bodyClass;
	}
}
