/**
 * 
 * Java Image Requests
 * If you'd like an easy way of working with Gravatar, then check out Ralf Ebert's jgravatar library, otherwise read on.
 * Things are a little complex in Java. The following class will provide you with a static method that returns the hex format md5 of an input string:
 * 
 * This class can then be used to return the MD5 hash of an email address (make sure you lower case it first!) like this:
	
	String email = "someone@somewhere.com";
	String hash = MD5Util.md5Hex(email);
	
	http://www.gravatar.com/avatar/bdaa29d918b1815d5a49bbd29208575e？d=http%3A%2F%2Fexample.com%2Fimages%2Favatar.jpg&s=200&r=pg
	
 * With the hex string that is returned, you can construct your gravatar URL.
 * 
 * https://en.gravatar.com/site/implement/images/java/
 */
package com.rolyer.blog.util;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class MD5Util {
	public static String hex(byte[] array) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < array.length; ++i) {
			sb.append(Integer.toHexString((array[i] & 0xFF) | 0x100).substring(
					1, 3));
		}
		return sb.toString();
	}

	public static String md5Hex(String message) {
		try {
			MessageDigest md = MessageDigest.getInstance("MD5");
			return hex(md.digest(message.getBytes("CP1252")));
		} catch (NoSuchAlgorithmException e) {
		} catch (UnsupportedEncodingException e) {
		}
		return null;
	}
}