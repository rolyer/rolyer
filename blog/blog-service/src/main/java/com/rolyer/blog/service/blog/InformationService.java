/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-6-8
 */
package com.rolyer.blog.service.blog;

import com.rolyer.blog.domain.InformationDO;

/**
 * 我的信息接口
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
public interface InformationService {
	/**
	 * 更新关于我
	 * @param information
	 * @return
	 */
	public Integer updateInformationAboutMe(InformationDO information);
	/**
	 * 更新 联系我
	 * @param information
	 * @return
	 */
	public Integer updateInformationContactMe(InformationDO information);
	/**
	 * 获取第一条信息记录
	 * @return
	 */
	public InformationDO queryFirstInformation();
}
