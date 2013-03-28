/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-5-5
 */
package com.rolyer.blog.persist.blog;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rolyer.blog.domain.CategoryDO;
import com.rolyer.blog.persist.BaseDaoTestCase;


/**
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
public class CategoryDAOTest extends BaseDaoTestCase {
	@Autowired
	private CategoryDAO categoryDAO;
	
	public void test_insertCategory() {
		clean();
		Integer id=categoryDAO.insertCategory(getCategoryDO());
		
		assertTrue(id.toString(), id.intValue()>0);
	}
	
	public void test_deleteCategoryById() {
		clean();
		Integer id=categoryDAO.insertCategory(getCategoryDO());
		Integer im=categoryDAO.deleteCategoryById(id);
		
		assertTrue(im.toString(), im.intValue()>0);
	}
	
	public void test_updateCategory() {
		clean();
		Integer id=categoryDAO.insertCategory(getCategoryDO());
		CategoryDO category=getCategoryDO();
		category.setId(id);
		category.setName("类别名称");
		Integer im=categoryDAO.updateCategory(category);
		
		assertTrue(im.toString(), im.intValue()>0);
	}
	
	public void test_queryCategoryById() {
		clean();
		Integer id=categoryDAO.insertCategory(getCategoryDO());
		CategoryDO category=categoryDAO.queryCategoryById(id);
		
		assertTrue(category.getId().toString(), category.getId().intValue()==id.intValue());
	}
	
	public void test_queryCategoryList() {
		clean();
		for (int i = 1; i <= 8; i++) {
			categoryDAO.insertCategory(getCategoryDO());
		}
		
		List<CategoryDO> list=categoryDAO.queryCategoryList();
		
		assertTrue(list.size()+"", list.size()>=8);
	}
	

	public CategoryDO getCategoryDO(){
		CategoryDO category=new CategoryDO();
		category.setName("name");
		
		return category;
	}
	
	public void clean(){
		try {
			connection.prepareStatement("delete from category where id >2").execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
