package com.medium.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QTweet is a Querydsl query type for QTweet
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QTweet extends com.querydsl.sql.RelationalPathBase<QTweet> {

    private static final long serialVersionUID = -1225986914;

    public static final QTweet tweet1 = new QTweet("tweet");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath tweet = createString("tweet");

    public final com.querydsl.sql.PrimaryKey<QTweet> primary = createPrimaryKey(id);

    public QTweet(String variable) {
        super(QTweet.class, forVariable(variable), "null", "tweet");
        addMetadata();
    }

    public QTweet(String variable, String schema, String table) {
        super(QTweet.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QTweet(String variable, String schema) {
        super(QTweet.class, forVariable(variable), schema, "tweet");
        addMetadata();
    }

    public QTweet(Path<? extends QTweet> path) {
        super(path.getType(), path.getMetadata(), "null", "tweet");
        addMetadata();
    }

    public QTweet(PathMetadata metadata) {
        super(QTweet.class, metadata, "null", "tweet");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(tweet, ColumnMetadata.named("tweet").withIndex(2).ofType(Types.VARCHAR).withSize(255));
    }

}

