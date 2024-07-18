package com.example.example;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DbTest {

	
	@Autowired
	DataSource dataSource;
	
	@Test
	public void connection() throws SQLException {
		try(Connection connection = dataSource.getConnection()) {
			DatabaseMetaData metaData = connection.getMetaData();
			log.info("URL : " + metaData.getURL());
			log.info("DriverName : " + metaData.getDriverName());
			log.info("UserNmae : " + metaData.getUserName());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
}
