/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-4-22
 */
package com.rolyer.blog.persist.blog.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.rolyer.blog.domain.blog.ArticleDO;
import com.rolyer.blog.dto.ArticleDTO;
import com.rolyer.blog.persist.blog.ArticleDAO;

/**
 * 文章接口实现类
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
@Component("articleDAO")
public class ArticleDAOImpl extends SqlMapClientDaoSupport implements ArticleDAO {

	public Integer deleteArticleById(Integer id) {
		Assert.notNull(id, "the id must not be null");
		
		return getSqlMapClientTemplate().delete("sqlMapArticle.deleteArticleById", id);
	}

	public Integer insertArticle(ArticleDO article) {
		Assert.notNull(article, "the object of article must not be null");
		Assert.notNull(article.getTitle(), "the title must not be null");
		Assert.notNull(article.getContent(), "the content must not be null");
		Assert.notNull(article.getCategoryId(), "the category must not be null");
		
		return (Integer) getSqlMapClientTemplate().insert("sqlMapArticle.insertArticle", article);
	}

	@SuppressWarnings("unchecked")
	public List<ArticleDO> queryArticleByCategoryId(Integer id) {
		Assert.notNull(id, "the id must not be null");
		
		return getSqlMapClientTemplate().queryForList("sqlMapArticle.queryArticleByCategoryId", id);
	}

	public ArticleDTO queryArticleById(Integer id) {
		Assert.notNull(id, "the id must not be null");
		
		return (ArticleDTO) getSqlMapClientTemplate().queryForObject("sqlMapArticle.queryArticleById", id);
	}

	public Integer upadteArticle(ArticleDO article) {
		Assert.notNull(article, "the object of article must not be null");
		Assert.notNull(article.getId(), "the id must not be null");
		Assert.notNull(article.getTitle(), "the title must not be null");
		Assert.notNull(article.getContent(), "the content must not be null");
		Assert.notNull(article.getCategoryId(), "the category must not be null");
		
		return getSqlMapClientTemplate().update("sqlMapArticle.upadteArticle", article);
	}

}
