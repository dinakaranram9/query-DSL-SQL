package com.medium.querydslsql.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.medium.querydslsql.service.TweetService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/medium")
@Api(value = "API to get tweets")
public class TweetController {

	@Autowired
	TweetService tweetService;

	@PostMapping("/saveTweets-jpa")
	@ApiOperation("api to store tweets using jpa")
	String saveTweetUsingJPA() {
		return tweetService.saveTweetUsingJPA();
	}

	@PostMapping("/savetweets-querydsl")
	@ApiOperation("api to store tweets using querydsl sql")
	String saveTweetUsingQueryDslSql() {
		return tweetService.saveTweetUsingQueryDslSql();
	}
	
	@PostMapping("/savetweets-jdbc")
	@ApiOperation("api to store tweets using jdbc")
	String saveTweetUsingJdbc() {
		return tweetService.saveTweetUsingJdbc();
	}

}
