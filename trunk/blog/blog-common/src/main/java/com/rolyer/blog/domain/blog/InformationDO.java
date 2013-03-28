/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-6-8
 */
package com.rolyer.blog.domain.blog;

import java.util.Date;

/**
 * 我的信息
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
public class InformationDO implements java.io.Serializable {

	/**
	 * 序列化
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;				//编号
	private String aboutMe;			//关于我
	private String contactMe;		//联系我
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
	 * @return the aboutMe
	 */
	public String getAboutMe() {
		return aboutMe;
	}
	/**
	 * @param aboutMe the aboutMe to set
	 */
	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}
	/**
	 * @return the contactMe
	 */
	public String getContactMe() {
		return contactMe;
	}
	/**
	 * @param contactMe the contactMe to set
	 */
	public void setContactMe(String contactMe) {
		this.contactMe = contactMe;
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
