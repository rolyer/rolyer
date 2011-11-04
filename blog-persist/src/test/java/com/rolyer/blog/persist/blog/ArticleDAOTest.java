package com.rolyer.blog.persist.blog;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rolyer.blog.domain.blog.ArticleDO;
import com.rolyer.blog.dto.ArticleDTO;
import com.rolyer.blog.persist.BaseDaoTestCase;


public class ArticleDAOTest extends BaseDaoTestCase {
	@Autowired
	private ArticleDAO articleDAO;
	
	public void test_insert_article() {
		clean();
		Integer id=articleDAO.insertArticle(getArticleDO());
		
		assertTrue(id.toString(), id.intValue()>0);
	}
	
	public void test_delete_article_by_id(){
		clean();
		Integer id=articleDAO.insertArticle(getArticleDO());
		Integer im=articleDAO.deleteArticleById(id);
		
		assertTrue(im.toString(), im.intValue()>0);
	}
	
	public void test_update_article(){
		clean();
		Integer id=articleDAO.insertArticle(getArticleDO());
		ArticleDO article=getArticleDO();
		article.setId(id);
		article.setCategoryId(2);
		article.setGmtModified(new Date());
		Integer im=articleDAO.upadteArticle(article);
		
		assertTrue(im.toString(), im.intValue()>0);
	}
	
	public void test_query_article_by_id() {
		clean();
		ArticleDO article=getArticleDO();
		article.setTitle("标题");
		article.setCategoryId(2);
		article.setGmtModified(new Date());
		Integer id=articleDAO.insertArticle(article);
		
		ArticleDTO articleDTO=articleDAO.queryArticleById(id);
		
		assertTrue(articleDTO.getArticle().getTitle(), articleDTO.getArticle().getTitle().equals("标题"));
	}
	
	public void test_query_article_by_category_id(){
		clean();
		for (int i = 1; i <= 10; i++) {
			ArticleDO article=getArticleDO();
			article.setTitle("title"+i);
			article.setCategoryId(0);
			articleDAO.insertArticle(article);
		}
		
		List<ArticleDO> list=articleDAO.queryArticleByCategoryId(0);
		
		assertTrue(list.size()+"", list.size()==10);
	}
	
	public void test_query_article_list(){
		clean();
		for (int i = 1; i <= 10; i++) {
			ArticleDO article=getArticleDO();
			article.setTitle("title"+i);
			articleDAO.insertArticle(article);
		}
		ArticleDTO articleDTO=new ArticleDTO();
		List<ArticleDTO> list=articleDAO.queryArticleList(articleDTO);
		
		Integer count=articleDAO.queryArticleCount(articleDTO);
		
		assertTrue(list.size()+"", list.size()==count.intValue());
	}
	
	
	public ArticleDO getArticleDO(){
		ArticleDO article=new ArticleDO();
		article.setCategoryId(1);
		article.setContent("content");
		article.setGmtCreated(new Date());
		article.setGmtModified(new Date());
		article.setTitle("title");
		article.setViews(0);
		article.setCommentsNumber(10);
		return article;
	}
	
	public void clean(){
		try {
			connection.prepareStatement("delete from article").execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
