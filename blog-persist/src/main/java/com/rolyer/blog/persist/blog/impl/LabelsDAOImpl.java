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

import com.rolyer.blog.domain.blog.LabelsDO;
import com.rolyer.blog.persist.blog.LabelsDAO;

/**
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
@Component("labelsDAO")
public class LabelsDAOImpl extends SqlMapClientDaoSupport implements LabelsDAO {
	
	public Integer deleteLabelsById(Integer id) {
		Assert.notNull(id, "the id must not be null");
		return getSqlMapClientTemplate().delete("sqlMapLabels.deleteLabelsById", id);
	}

	public Integer insertLabels(LabelsDO labels) {
		Assert.notNull(labels, "the object of category must not be null");
		Assert.notNull(labels.getName(), "the name must not be null");

		return (Integer) getSqlMapClientTemplate().insert("sqlMapLabels.insertLabels", labels);
	}

	public LabelsDO queryLabelsById(Integer id) {
		Assert.notNull(id, "the id must not be null");
		
		return (LabelsDO) getSqlMapClientTemplate().queryForObject("sqlMapLabels.queryLabelsById", id);
	}

	@SuppressWarnings("unchecked")
	public List<LabelsDO> queryLabelsList() {
		return getSqlMapClientTemplate().queryForList("sqlMapLabels.queryLabelsList");
	}

	public Integer updateLabels(LabelsDO labels) {
		Assert.notNull(labels, "the object of category must not be null");
		Assert.notNull(labels.getId(), "the id must not be null");
		Assert.notNull(labels.getName(), "the name must not be null");
		
		return getSqlMapClientTemplate().update("sqlMapLabels.updateLabels", labels);
	}
}
