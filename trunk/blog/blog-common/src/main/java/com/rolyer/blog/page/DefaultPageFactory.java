/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2011-11-02
 */
package com.rolyer.blog.page;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;

import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.web.context.ServletContextAware;

/**
 * 从XML获取Page对象的配置值并填充
 * 
 * @author Rolyer (rolyer.live@gmail.com)
 * 
 */
public class DefaultPageFactory implements PageFactory, ServletContextAware, InitializingBean {
    private List<String> pageFiles;
    private Map<String, Page> pages = new HashMap<String, Page>();
    private ServletContext servletContext;

    public Page getPage(String pageName) {
        return pages.get(pageName);
    }

    @SuppressWarnings("unchecked")
    public void afterPropertiesSet() throws Exception {
        String path = servletContext.getRealPath("/");
        SAXReader reader = new SAXReader();
        Document document = null;
        for (int i = 0; i < pageFiles.size(); i++) {
            document = reader.read(new File(path + pageFiles.get(i)));
            Element root = document.getRootElement();
            for (Iterator<Element> pageGroups = root.elementIterator(); pageGroups.hasNext();) {
                Page page = new Page();
                Element pageGroup = pageGroups.next();
                for (Iterator<Attribute> pageGroupAttr = pageGroup.attributeIterator(); pageGroupAttr
                        .hasNext();) {
                    Attribute attribute = pageGroupAttr.next();
                    page.setPageName(attribute.getValue());
                }
                for (Iterator<Element> tagGroups = pageGroup.elementIterator(); tagGroups.hasNext();) {
                    Element tagGroup = tagGroups.next();
                        String nodeName = tagGroup.getName();
                        String nodeText = tagGroup.getTextTrim();
                        if (nodeName.equals("title")) {
                            page.setTitle(nodeText);
                        } else if (nodeName.equals("keywords")) {
                            page.setKeywords(nodeText);
                        } else if (nodeName.equals("description")) {
                            page.setDescription(nodeText);
                        }
                    
                }
                pages.put(page.getPageName(), page);
            }
        }

    }

    public void setPageFiles(List<String> pageFiles) {
        this.pageFiles = pageFiles;
    }

    public void setServletContext(ServletContext servletContext) {
        this.servletContext = servletContext;

    }

}
