/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-5-6
 */
package com.rolyer.blog.service.blog;

import java.util.List;

import com.rolyer.blog.domain.LabelsDO;

/**
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
public interface LabelsService {
	public Integer insertLabels(LabelsDO labels);
	public Integer deleteLabelsById(Integer id);
	public Integer updateLabels(LabelsDO labels);
	public LabelsDO queryLabelsById(Integer id);
	public List<LabelsDO> queryLabelsList();
}
