/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-5-5
 */
package com.rolyer.blog.persist.blog;

import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rolyer.blog.domain.LabelsDO;
import com.rolyer.blog.persist.BaseDaoTestCase;


/**
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
public class LabelsDAOTest extends BaseDaoTestCase {
	@Autowired
	private LabelsDAO labelsDAO;
	
	public void test_insertLabels() {
		clean();
		Integer id=labelsDAO.insertLabels(getLabelsDO());
		
		assertTrue(id.toString(), id.intValue()>0);
	}
	
	public void test_deleteLabelsById() {
		clean();
		Integer id=labelsDAO.insertLabels(getLabelsDO());
		Integer im=labelsDAO.deleteLabelsById(id);
		
		assertTrue(im.toString(), im.intValue()>0);
	}
	
	public void test_updateLabels() {
		clean();
		Integer id=labelsDAO.insertLabels(getLabelsDO());
		LabelsDO Labels=getLabelsDO();
		Labels.setId(id);
		Labels.setName("类别名称");
		Integer im=labelsDAO.updateLabels(Labels);
		
		assertTrue(im.toString(), im.intValue()>0);
	}
	
	public void test_queryLabelsById() {
		clean();
		Integer id=labelsDAO.insertLabels(getLabelsDO());
		LabelsDO Labels=labelsDAO.queryLabelsById(id);
		
		assertTrue(Labels.getId().toString(), Labels.getId().intValue()==id.intValue());
	}
	
	public void test_queryLabelsList() {
		clean();
		for (int i = 1; i <= 8; i++) {
			labelsDAO.insertLabels(getLabelsDO());
		}
		
		List<LabelsDO> list=labelsDAO.queryLabelsList();
		
		assertTrue(list.size()+"", list.size()>=8);
	}
	

	public LabelsDO getLabelsDO(){
		LabelsDO labels=new LabelsDO();
		labels.setName("name");
		
		return labels;
	}
	
	public void clean(){
		try {
			connection.prepareStatement("delete from labels").execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
