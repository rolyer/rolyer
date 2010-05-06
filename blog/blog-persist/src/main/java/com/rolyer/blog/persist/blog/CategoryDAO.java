/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-5-4
 */
package com.rolyer.blog.persist.blog;

import java.util.List;

import com.rolyer.blog.domain.blog.CategoryDO;

/**
 * 文章类别接口
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
public interface CategoryDAO {
	public Integer insertCategory(CategoryDO category);
	public Integer deleteCategoryById(Integer id);
	public Integer updateCategory(CategoryDO category);
	public CategoryDO queryCategoryById(Integer id);
	public List<CategoryDO> queryCategoryList(/*Map<String, Object> param*/);
}
