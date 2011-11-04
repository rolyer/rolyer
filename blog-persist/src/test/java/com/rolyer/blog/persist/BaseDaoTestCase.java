/**
 * Copyright 2010 ROLYER.
 * All right reserved.
 * Created on 2010-4-22
 */
package com.rolyer.blog.persist;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientFactoryBean;

import com.ibatis.sqlmap.client.SqlMapClient;

/**
 * @author Rolyer (rolyer.live@gmail.com)
 *
 */
public class BaseDaoTestCase extends org.springframework.test.AbstractDependencyInjectionSpringContextTests {

	protected Connection connection;

	@Autowired
	private SqlMapClientFactoryBean sqlMapClient;

	protected String[] getConfigLocations(){
		return new String[] {"spring-persist-test.xml"};
	}


	public void onSetUp(){
//		PropertyConfigurator.configure(BaseDaoTestCase.class.getClassLoader().getResource("log4j.properties"));
		try{
			connection = ((SqlMapClient) sqlMapClient.getObject()).getDataSource().getConnection();
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void onTearDown(){
		if(connection!=null){
			try {
				connection.close();
			} catch (SQLException e) {
			}
		}
	}

//	protected void cleanupAdminMenu() throws SQLException{
//		connection.prepareStatement("delete from admin_menu").execute();
//	}
//
//	protected void cleanup(){
//		//清除测试数据
//		try {
//			cleanupAdminMenu();
//		} catch (SQLException e) {
//		}
//	}
}
