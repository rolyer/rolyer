/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-5-5
 */
package com.rolyer.blog.service.blog.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.rolyer.blog.domain.blog.ArticleDO;
import com.rolyer.blog.dto.ArticleDTO;
import com.rolyer.blog.persist.blog.ArticleDAO;
import com.rolyer.blog.service.blog.ArticleService;

/**
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
@Component("articleService")
public class ArticleServiceImpl implements ArticleService {

	@Autowired
	private ArticleDAO articleDAO;
	
	public Integer deleteArticleById(Integer id) {
		Assert.notNull(id, "the id must not be null");
		return articleDAO.deleteArticleById(id);
	}

	public Integer insertArticle(ArticleDO article) {
		Assert.notNull(article, "the object of article must not be null");
		Assert.notNull(article.getTitle(), "the title must not be null");
		Assert.notNull(article.getContent(), "the content must not be null");
		Assert.notNull(article.getCategoryId(), "the category must not be null");
		
		return articleDAO.insertArticle(article);
	}

	public List<ArticleDO> queryArticleByCategoryId(Integer id) {
		Assert.notNull(id, "the id must not be null");
		return articleDAO.queryArticleByCategoryId(id);
	}

	public ArticleDTO queryArticleById(Integer id) {
		Assert.notNull(id, "the id must not be null");
		return articleDAO.queryArticleById(id);
	}

	public Integer upadteArticle(ArticleDO article) {
		Assert.notNull(article, "the object of article must not be null");
		Assert.notNull(article.getId(), "the id must not be null");
		Assert.notNull(article.getTitle(), "the title must not be null");
		Assert.notNull(article.getContent(), "the content must not be null");
		Assert.notNull(article.getCategoryId(), "the category must not be null");
		
		return articleDAO.upadteArticle(article);
	}

}
