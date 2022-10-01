package com.medium.querydslsql.config;

import java.io.File;
import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import com.querydsl.sql.codegen.MetaDataExporter;

@Configuration
public class QuerydslSQL {
	
	@Autowired
	DataSource dataSource;
	
	@PostConstruct
	public void config() throws SQLException {
		java.sql.Connection conn = dataSource.getConnection();
		MetaDataExporter exporter = new MetaDataExporter();
		exporter.setPackageName("com.medium.domain");
		exporter.setTargetFolder(new File("src/main/java"));
		exporter.export(conn.getMetaData());  
	}

}
