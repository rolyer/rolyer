/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-5-2
 */
package com.rolyer.blog.domain;

/**
 * 文章类别实体类
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
public class CategoryDO implements java.io.Serializable {

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;				//编号
	private String name;			//类别名称
	
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
}
