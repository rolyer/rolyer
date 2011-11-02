/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2011-11-02
 */
package com.rolyer.blog.page;

import com.rolyer.blog.util.StringUtils;

/**
 * @author Rolyer (rolyer.live@gmail.com)
 * 
 */
public class Page {
	private String pageName;
	private String title;
	private String keywords;
	private String description;

	public String getTitle() {
		if (StringUtils.isBlank(title)) {
			return "Welcom to my blog!";
		} else {
			return title;
		}
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getKeywords() {
		if (StringUtils.isBlank(keywords)) {
			return "blog, roleyr,Rolyer's Blog";
		} else {
			return keywords;
		}
	}

	public void setKeywords(String keywords) {
		this.keywords = keywords;
	}

	public String getDescription() {
		if (StringUtils.isBlank(description)) {
			return "This is my blog, Developed by Roleyr.";
		} else {
			return description;
		}
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getPageName() {
		return pageName;
	}
}
