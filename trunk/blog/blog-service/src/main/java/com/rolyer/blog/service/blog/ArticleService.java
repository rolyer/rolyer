/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-5-5
 */
package com.rolyer.blog.service.blog;

import java.util.List;

import com.rolyer.blog.domain.ArticleDO;
import com.rolyer.blog.dto.ArticleDTO;

/**
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
public interface ArticleService {
	public Integer insertArticle(ArticleDO article);
	public Integer deleteArticleById(Integer id);
	public Integer upadteArticle(ArticleDO article);
	public ArticleDTO queryArticleById(Integer id);
	public List<ArticleDO> queryArticleByCategoryId(Integer id);
	
	public List<ArticleDTO> queryArticleList(ArticleDTO articleDTO);
	public Integer queryArticleCount(ArticleDTO articleDTO);
}
