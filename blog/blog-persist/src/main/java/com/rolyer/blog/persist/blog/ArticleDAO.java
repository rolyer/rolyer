/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-5-3
 */
package com.rolyer.blog.persist.blog;

import java.util.List;

import com.rolyer.blog.domain.blog.ArticleDO;
import com.rolyer.blog.dto.ArticleDTO;

/**
 * 文章接口
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
public interface ArticleDAO {
	public Integer insertArticle(ArticleDO article);
	public Integer deleteArticleById(Integer id);
	public Integer upadteArticle(ArticleDO article);
	public ArticleDTO queryArticleById(Integer id);
	public List<ArticleDO> queryArticleByCategoryId(Integer id);
}
