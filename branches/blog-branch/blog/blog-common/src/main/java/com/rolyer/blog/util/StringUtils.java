/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-5-11
 */
package com.rolyer.blog.util;

import java.io.UnsupportedEncodingException;
import java.text.DecimalFormat;
import java.util.Random;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
public class StringUtils {
	public static boolean isContains(String[] strs, String s) {
		// 此方法有两个参数，第一个是要查找的字符串数组，第二个是要查找的字符或字符串

		for (int i = 0; i < strs.length; i++) {
			if (strs[i].indexOf(s) != -1) {// 循环查找字符串数组中的每个字符串中是否包含所有查找的内容
				return true;// 查找到了就返回真，不在继续查询
			}
		}
		return false;// 没找到返回false
	}

	/**
	 * @param s
	 * @return
	 */
	public static boolean isNumber(String s) {
		for (int i = 0; i < s.length(); i++) {
			if (!((s.charAt(i) >= '0') && (s.charAt(i) <= '9'))) {
				return false;
			}
		}
		return true;
	}

	/**
	 * @param s
	 * @return
	 */
	public static boolean isIp(String s) {
		String strMatch = "^(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])\\.(\\d{1,2}|1\\d\\d|2[0-4]\\d|25[0-5])$";
		Pattern ParsePattern = Pattern.compile(strMatch);
		Matcher ParseMatcher = ParsePattern.matcher(s);
		return ParseMatcher.find();
	}

	/**
	 * @param s
	 * @return
	 */
	public static boolean isDomainName(String s) {
		String strMatch = "[a-zA-Z0-9]+([a-zA-Z0-9\\-\\.]+)?\\.(com|cn|org|net|mil|edu|COM|ORG|NET|MIL|EDU)";
		Pattern ParsePattern = Pattern.compile(strMatch);
		Matcher ParseMatcher = ParsePattern.matcher(s);
		return ParseMatcher.find();
	}

    /**
     * @param s
     * @return
     */
    public static boolean isEmail(String s) {
        String strMatch = "([0-9a-zA-Z]([-.\\w]*[0-9a-zA-Z])*@([0-9a-zA-Z][-\\w]*[0-9a-zA-Z]\\.)+[a-zA-Z]{2,9})";
        Pattern ParsePattern = Pattern.compile(strMatch);
        Matcher ParseMatcher = ParsePattern.matcher(s);
        return ParseMatcher.find();
    }

    /**
     * @param d
     * @param pL
     * @return
     */
    public static String getStandardDouble(double d, int pL) {
        String format = "0.";
        for (int i = 0; i < pL; i++)
            format += "0";
        return ((new DecimalFormat(format)).format(d));
    }

    /**
     * @param n
     * @return
     */
    public static String getRandValue(int n) {
        String sRand = "";
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            String rand = String.valueOf(random.nextInt(10));
            sRand += rand;
        }
        return sRand;
    }

    /**
     * @param str
     * @return
     */
    public static boolean isEmpty(String str) {
        return (str == null) || (str.length() == 0);
    }

	/**
	 * @param str
	 * @return
	 */
	public static boolean isNotEmpty(String str) {
		return !isEmpty(str);
	}

	/**
	 * 返回非null的字符串
	 * @param s
	 * @return
	 */
	public static String getNotNullValue(Object s) {
		return s == null ? "" : s.toString();
	}

    /**
     * 将"1,2,3,4"格式的字符串转换成integer数组
     * @param strArray
     * @return
     */
    public static Integer[] StringToIntegerArray(String strArray){
		Integer ids[] = {};
		do {
			if(strArray==null){
				break;
			}
			String[] idstrArray=strArray.split(",");
			if(idstrArray.length==0){
				break;
			}
			ids=new Integer[idstrArray.length];
			for(int i=0;i<idstrArray.length;i++){
				ids[i]=Integer.valueOf(idstrArray[i]);
			}
		} while (false);
		return ids;
	}

    /**
	 * 检查字符串是否是空白： <code>null</code> 、空字符串 <code>""</code> 或只有空白字符。
	 *
	 * <pre>
	 *
	 *    StringUtil.isBlank(null)      = true
	 *    StringUtil.isBlank(&quot;&quot;)        = true
	 *    StringUtil.isBlank(&quot; &quot;)       = true
	 *    StringUtil.isBlank(&quot;bob&quot;)     = false
	 *    StringUtil.isBlank(&quot;  bob  &quot;) = false
	 *
	 * </pre>
	 *
	 * @param str
	 *            要检查的字符串
	 *
	 * @return 如果为空白, 则返回 <code>true</code>
	 */
	public static boolean isBlank(String str) {
		int length;

		if ((str == null) || ((length = str.length()) == 0)) {
			return true;
		}

		for (int i = 0; i < length; i++) {
			if (!Character.isWhitespace(str.charAt(i))) {
				return false;
			}
		}

		return true;
	}//add by rolyer 2010.03.16

	/**
	 * 过滤sql句的敏感字符（'）
	 * @param sql
	 * @return
	 */
	public static String filterSql(String sql){
		return sql.replace('\'','‘');
	}

	/**
	 * 编码URL带的参数
	 * @param str 参数
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String decryptUrlParameter(String str) throws UnsupportedEncodingException{
		if(isEmpty(str)){
			return "";
		}
	 	return new String(str.getBytes("ISO-8859-1"), "UTF-8");
	}

	/**
	 * 加密URL带的参数
	 * @param str 参数
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static String encryptUrlParameter(String str) throws UnsupportedEncodingException{
		if(isEmpty(str)){
			return "";
		}
	 	return new String(str.getBytes("UTF-8"),"ISO-8859-1" );
	}
}
