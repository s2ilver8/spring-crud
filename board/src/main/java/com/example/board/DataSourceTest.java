package com.example.board;

import java.sql.Connection;

import javax.inject.Inject;
import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "file:src/main/webapp/WEB-INF/spring/*.xml"})
public class DataSourceTest {
	
	@Inject
	private DataSource dataSource;
	
	@Test
	public void dataSourceConnectionTest() throws Exception {
		Connection connection = null;
		
		try {
			connection = dataSource.getConnection();
			System.out.println("connection : " + connection);
		} catch (Exception e) {
			e.getMessage();
		}
	}

}
