package com.medium.querydslsql.serviceimpl;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.TransactionAwareDataSourceProxy;
import org.springframework.stereotype.Service;

import com.medium.domain.QTweet;
import com.medium.querydslsql.entity.Tweet;
import com.medium.querydslsql.repository.TweetRepository;
import com.medium.querydslsql.service.TweetService;
import com.querydsl.sql.Configuration;
import com.querydsl.sql.MySQLTemplates;
import com.querydsl.sql.SQLQueryFactory;
import com.querydsl.sql.SQLTemplates;
import com.querydsl.sql.dml.SQLInsertClause;

@Service
public class TweetServiceImpl implements TweetService {

	@Autowired
	TweetRepository tweetRepository;

	@Autowired
	DataSource dataSource;

	@Autowired
	JdbcTemplate jdbcTemplate;

	@Override
	public String saveTweetUsingJPA() {
		long startTime = System.currentTimeMillis();
		List<Tweet> tweetList = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			Tweet tweet = new Tweet();
			tweet.setTweet("test tweets");
			tweetList.add(tweet);
		}
		tweetRepository.saveAll(tweetList);
		System.out.println("Time taken to save tweets" + (System.currentTimeMillis() - startTime) / 1000 + " s");
		return "return successfully";
	}

	@Override
	public String saveTweetUsingQueryDslSql() {
		long startTime = System.currentTimeMillis();
		QTweet tweet = QTweet.tweet1;
		SQLTemplates templates = MySQLTemplates.builder().build();
		Configuration config = new Configuration(templates);
		SQLQueryFactory queryFactory = new SQLQueryFactory(config, new TransactionAwareDataSourceProxy(dataSource));
		SQLInsertClause insert = queryFactory.insert(tweet);
		for (int i = 0; i < 5; i++) {
			insert.set(tweet.tweet, "test stream").addBatch();
		}
		insert.execute();
		System.out.println("Time taken to save tweets" + (System.currentTimeMillis() - startTime) / 1000 + " s");
		return "tweets inserted successfully";
	}

	@Override
	public String saveTweetUsingJdbc() {
		long startTime = System.currentTimeMillis();
		String sql = "insert into tweet(tweet) values(?)";
		List<Tweet> tweetList = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			Tweet tweet = new Tweet();
			tweet.setTweet("test tweets");
			tweetList.add(tweet);
		}
		jdbcTemplate.batchUpdate(sql, tweetList, 50, (ps, tweet) -> {
			ps.setString(1, tweet.getTweet());
		});
		System.out.println("Time taken to save tweets" + (System.currentTimeMillis() - startTime) / 1000 + " s");
		return "returned successfully";
	}

}
