/**
 * Copyright 2010 ASTO.
 * All right reserved.
 * Created on 2010-1-23 by Mays@caiban.net.
 */
package com.rolyer.blog.web.filters;

import javax.servlet.http.HttpServletResponse;

/**
 * @author mays@caiban.net
 *
 */
public class ResponseThreadLocal {

	private static ThreadLocal<HttpServletResponse> responseThreadLocal = new ThreadLocal<HttpServletResponse>();

	public static void set(HttpServletResponse response) {
		responseThreadLocal.set(response);
	}

	public static HttpServletResponse get() {
		return responseThreadLocal.get();
	}
}
