package com.rolyer.blog.persist.blog;

import java.sql.SQLException;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.rolyer.blog.domain.CommentsDO;
import com.rolyer.blog.persist.BaseDaoTestCase;

public class CommentDAOTest extends BaseDaoTestCase {

	@Autowired
	private CommentDAO commentDAO;
	
	public void test_insert_comment() {
		clean();
		Integer id = commentDAO.insertComment(getCommentsDO());
		assertNotNull(id);
		assertTrue(id.intValue()>0);
	}
	
	public void test_delete_comment_by_id() {
		
		clean();
		Integer id = commentDAO.insertComment(getCommentsDO());
		assertNotNull(id);
		
		Integer ip = commentDAO.deleteCommentById(id);
		
		assertNotNull(ip);
		assertTrue(ip.intValue()==1);
	}
	
	public void test_upadte_comment_content_by_id() {
		clean();
		Integer id = commentDAO.insertComment(getCommentsDO());
		assertNotNull(id);
		
		String content = "this is a test for upadteCommentContentById.";
		Integer ip = commentDAO.upadteCommentContentById(id, content);
		
		assertNotNull(ip);
		assertTrue(ip.intValue()==1);
	}
	
	public void test_queryCommentByObjectId() {
		Integer objectId = 1;
		clean();
		for (int i = 1; i < 20; i++) {
			CommentsDO c = getCommentsDO();
			c.setName("Test Name " + i);
			c.setContent("this is test comment "+i+".");
			c.setObjectId(objectId);
			c.setType("T");
			Integer id = commentDAO.insertComment(c);
			assertNotNull(id);
		}
		
		List<CommentsDO> list = commentDAO.queryCommentByObjectId(objectId);
		
		assertNotNull(list);
		assertNotNull(list.size() == 20);
		//assertNotNull(list.get(2).getName().equals("Test Name 2"));
	}
	
	public CommentsDO getCommentsDO(){
		CommentsDO c=new CommentsDO();
		c.setContent("this is test comment.");
		c.setEmail("test@test.com");
		c.setGmtCreated(new Date());
		c.setIp("192.168.1.1");
		c.setName("Test Name");
		c.setObjectId(0);
		c.setType("0");
		return c;
	}
	
	public void clean(){
		try {
			connection.prepareStatement("delete from comments").execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
