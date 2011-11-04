package com.rolyer.blog.admin.util;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.support.WebBindingInitializer;
import org.springframework.web.context.request.WebRequest;

import com.rolyer.blog.util.BlogConst;

public class AstBindingInitializer implements WebBindingInitializer {

	public void initBinder(WebDataBinder webBinder, WebRequest request) {
		SimpleDateFormat dateFormat = new SimpleDateFormat(BlogConst.DATE_FORMATE_DEFAULT);
//		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-M-d");
		dateFormat.setLenient(false);
		webBinder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat,false));
		webBinder.registerCustomEditor(String.class, new StringTrimmerEditor(false));
	}

}
