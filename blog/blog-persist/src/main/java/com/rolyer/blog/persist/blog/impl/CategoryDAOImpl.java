/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-5-5
 */
package com.rolyer.blog.persist.blog.impl;

import java.util.List;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.rolyer.blog.domain.blog.CategoryDO;
import com.rolyer.blog.persist.blog.CategoryDAO;

/**
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
@Component("categoryDAO")
public class CategoryDAOImpl extends SqlMapClientDaoSupport implements CategoryDAO {

	public Integer deleteCategoryById(Integer id) {
		Assert.notNull(id, "the id must not be null");
		return getSqlMapClientTemplate().delete("sqlMapCategory.deleteCategoryById", id);
	}

	public Integer insertCategory(CategoryDO category) {
		Assert.notNull(category, "the object of category must not be null");
		Assert.notNull(category.getName(), "the name must not be null");

		return (Integer) getSqlMapClientTemplate().insert("sqlMapCategory.insertCategory", category);
	}

	public CategoryDO queryCategoryById(Integer id) {
		Assert.notNull(id, "the id must not be null");
		
		return (CategoryDO) getSqlMapClientTemplate().queryForObject("sqlMapCategory.queryCategoryById", id);
	}

	@SuppressWarnings("unchecked")
	public List<CategoryDO> queryCategoryList(/*Map<String, Object> param*/) {
//		Assert.notNull(param, "the param must not be null");
		return getSqlMapClientTemplate().queryForList("sqlMapCategory.queryCategoryList");
	}

	public Integer updateCategory(CategoryDO category) {
		Assert.notNull(category, "the object of category must not be null");
		Assert.notNull(category.getId(), "the id must not be null");
		Assert.notNull(category.getName(), "the name must not be null");
		
		return getSqlMapClientTemplate().update("sqlMapCategory.updateCategory", category);
	}
}
