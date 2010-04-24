package com.rolyer.blog.service;

import java.sql.Connection;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientFactoryBean;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

import com.ibatis.sqlmap.client.SqlMapClient;

public class BaseServiceTestCase extends AbstractDependencyInjectionSpringContextTests{

	protected Connection connection;

	@Autowired
	private SqlMapClientFactoryBean sqlMapClient;

	protected String[] getConfigLocations(){
		return new String[] {"spring-persist-test.xml","spring-service.xml"};
	}

	public void test_dmeo(){

	}

	public void onSetUp(){
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


//	protected void cleanup(){
//		//清除测试数据
//		try {
//			cleanupAdminMenu();
//		} catch (SQLException e) {
//		}
//	}
}
