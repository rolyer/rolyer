/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-4-21
 */
package com.rolyer.blog.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
public class AlgorithmUtils {
	public final static int LENGTH 	= 16;

	public static String MD5(String s, int length)
			throws NoSuchAlgorithmException, UnsupportedEncodingException {
		MessageDigest md5 = MessageDigest.getInstance("MD5");
		StringBuffer hexValue = new StringBuffer();
		byte[] md5Bytes = md5.digest(s.getBytes("utf-8"));
		for (int i = 0; i < md5Bytes.length; i++) {
			int val = ((int) md5Bytes[i]) & 0xff;
			if (val < 16) {
				hexValue.append("0");
			}
			hexValue.append(Integer.toHexString(val));
		}
		if (length == 32) {
			return hexValue.toString();
		} else {
			return hexValue.toString().substring(8, 24);
		}
	}

	public static void main(String[] args) {
		try {
			System.out.println(AlgorithmUtils.MD5("admin", 16));
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}

		String cp="/web";
		String uri="/web/zz91/admin/mymenu.htm";
		if(uri.startsWith(cp)){
			System.out.println(uri.substring(cp.length(),uri.length()));
		}
	}
}
