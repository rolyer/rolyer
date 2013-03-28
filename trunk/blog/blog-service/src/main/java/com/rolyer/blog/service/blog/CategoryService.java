/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-5-5
 */
package com.rolyer.blog.service.blog;

import java.util.List;

import com.rolyer.blog.domain.CategoryDO;

/**
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
public interface CategoryService {
	public Integer insertCategory(CategoryDO category);
	public Integer deleteCategoryById(Integer id);
	public Integer updateCategory(CategoryDO category);
	public CategoryDO queryCategoryById(Integer id);
	public List<CategoryDO> queryCategoryList();
}
