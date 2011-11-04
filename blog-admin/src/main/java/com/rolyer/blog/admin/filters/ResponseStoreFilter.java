/**
 * Copyright 2010 ASTO.
 * All right reserved.
 * Created on 2010-1-23 by Mays@caiban.net.
 */
package com.rolyer.blog.admin.filters;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * @author mays@caiban.net
 *
 */
public class ResponseStoreFilter implements Filter {

	public void destroy() {

	}

	public void doFilter(ServletRequest req, ServletResponse res,
			FilterChain chain) throws IOException, ServletException {
		ResponseThreadLocal.set((HttpServletResponse) res);
		chain.doFilter(req, res);
	}

	public void init(FilterConfig arg0) throws ServletException {
	}

}
