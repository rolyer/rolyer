/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-4-22
 */
package com.rolyer.blog.domain.user;

import java.util.Date;


/**
 * 用户（User）实体类 
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
public class UserDO implements java.io.Serializable {

	/**
	 *  序列化
	 */
	private static final long serialVersionUID = 5898739493264980152L;
	
	private Integer id;				//编号
	private String account;			//账号
	private String password;		//密码
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
	 * @return the account
	 */
	public String getAccount() {
		return account;
	}
	/**
	 * @param account the account to set
	 */
	public void setAccount(String account) {
		this.account = account;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
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
