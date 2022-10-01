package com.medium.querydslsql.service;

public interface TweetService {
	
	public String saveTweetUsingJPA();
	
	public String saveTweetUsingQueryDslSql();
	
	public String saveTweetUsingJdbc();
}
