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

import com.rolyer.blog.domain.CategoryDO;
import com.rolyer.blog.persist.blog.CategoryDAO;
import com.rolyer.blog.service.blog.CategoryService;

/**
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
@Component("categoryService")
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryDAO categoryDAO;
	
	public Integer deleteCategoryById(Integer id) {
		Assert.notNull(id, "the id must not be null");
		return categoryDAO.deleteCategoryById(id);
	}

	public Integer insertCategory(CategoryDO category) {
		Assert.notNull(category, "the object of category must not be null");
		Assert.notNull(category.getName(), "the name must not be null");
		
		return categoryDAO.insertCategory(category);
	}

	public CategoryDO queryCategoryById(Integer id) {
		Assert.notNull(id, "the id must not be null");
		return categoryDAO.queryCategoryById(id);
	}

	public List<CategoryDO> queryCategoryList() {
		return categoryDAO.queryCategoryList();
	}

	public Integer updateCategory(CategoryDO category) {
		Assert.notNull(category, "the object of category must not be null");
		Assert.notNull(category.getId(), "the id must not be null");
		Assert.notNull(category.getName(), "the name must not be null");
		
		return categoryDAO.updateCategory(category);
	}

}
