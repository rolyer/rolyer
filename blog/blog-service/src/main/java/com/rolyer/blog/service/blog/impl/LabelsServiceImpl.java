/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-5-6
 */
package com.rolyer.blog.service.blog.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import com.rolyer.blog.domain.LabelsDO;
import com.rolyer.blog.persist.blog.LabelsDAO;
import com.rolyer.blog.service.blog.LabelsService;

/**
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
@Component("labelsService")
public class LabelsServiceImpl implements LabelsService {
	@Autowired
	private LabelsDAO labelsDAO;
	
	public Integer deleteLabelsById(Integer id) {
		Assert.notNull(id, "the id must not be null");
		return labelsDAO.deleteLabelsById(id);
	}

	public Integer insertLabels(LabelsDO labels) {
		Assert.notNull(labels, "the object of category must not be null");
		Assert.notNull(labels.getName(), "the name must not be null");
		
		return labelsDAO.insertLabels(labels);
	}

	public LabelsDO queryLabelsById(Integer id) {
		Assert.notNull(id, "the id must not be null");
		return labelsDAO.queryLabelsById(id);
	}

	public List<LabelsDO> queryLabelsList() {
		return labelsDAO.queryLabelsList();
	}

	public Integer updateLabels(LabelsDO labels) {
		Assert.notNull(labels, "the object of category must not be null");
		Assert.notNull(labels.getId(), "the id must not be null");
		Assert.notNull(labels.getName(), "the name must not be null");
		
		return labelsDAO.updateLabels(labels);
	}
	
}
