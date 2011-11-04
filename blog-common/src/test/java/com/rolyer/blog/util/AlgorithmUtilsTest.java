/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-4-21
 */
package com.rolyer.blog.util;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

import junit.framework.TestCase;

/**
 * @author Rolyer (rolyer.live@gmail.com)
 * 
 */
public class AlgorithmUtilsTest extends TestCase {
	public void testMD5() {
		try {
			assertEquals("16位MD5测试：", "df30d7958af94ed8", AlgorithmUtils.MD5(
					"admmin", 16));
			assertEquals("32位MD5测试：", "db0b04e4df30d7958af94ed81189400c",
					AlgorithmUtils.MD5("admmin", 32));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
	}
}
