package com.rolyer.blog.admin.util;

import java.util.HashSet;
import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.util.Assert;

/**
 * 重载spring默认的属性配置文件解析器，这样，可以让配置文件bean可以作为普通的属性访问器来使用
 * 
 * @author roleyr
 */
public class PropertyPlaceholderConfigurer extends
		org.springframework.beans.factory.config.PropertyPlaceholderConfigurer {

	private Properties props;

	@SuppressWarnings("unchecked")
	protected void processProperties(
			ConfigurableListableBeanFactory beanFactoryToProcess,
			Properties superProps) throws BeansException {
		super.processProperties(beanFactoryToProcess, superProps);
		props = new Properties();
		for (Object key : superProps.keySet()) {
			String strKey = (String) key;
			String strVal = superProps.getProperty(strKey);
			strVal = super.parseStringValue(strVal, superProps, new HashSet());
			props.put(strKey, strVal);
		}
	}

	public String getProperty(String key) {
		Assert.hasText(key, "key can not be null.");
		Assert.isTrue(props.containsKey(key), "property:" + key
				+ " does not exist!");
		return props.getProperty(key);
	}

}
