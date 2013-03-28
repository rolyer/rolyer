/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-5-4
 */
package com.rolyer.blog.persist.blog;

import java.util.List;

import com.rolyer.blog.domain.LabelsDO;


/**
 * 文章标签接口
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
public interface LabelsDAO {
	public Integer insertLabels(LabelsDO labels);
	public Integer deleteLabelsById(Integer id);
	public Integer updateLabels(LabelsDO labels);
	public LabelsDO queryLabelsById(Integer id);
	public List<LabelsDO> queryLabelsList();
}
