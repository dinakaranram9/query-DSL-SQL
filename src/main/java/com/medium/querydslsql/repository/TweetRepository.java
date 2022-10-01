package com.medium.querydslsql.repository;

import java.util.List;

import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.medium.querydslsql.entity.Tweet;

@Repository
public interface TweetRepository extends JpaRepository<Tweet, Integer>{
	
	@EntityGraph(attributePaths = {"comments"})
	List<Tweet> findByTweetStartsWithIgnoreCase(String tweetSearchTerm);
}
