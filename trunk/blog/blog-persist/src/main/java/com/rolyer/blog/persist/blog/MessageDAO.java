/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-5-8
 */
package com.rolyer.blog.persist.blog;

import com.rolyer.blog.domain.blog.MessageDO;

/**
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
public interface MessageDAO {
	public Integer insertMessage(MessageDO message);
	public Integer deleteMessage(MessageDO message);
}
