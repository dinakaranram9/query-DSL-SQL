package com.medium.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAbhiPostComments is a Querydsl query type for QAbhiPostComments
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAbhiPostComments extends com.querydsl.sql.RelationalPathBase<QAbhiPostComments> {

    private static final long serialVersionUID = 178162793;

    public static final QAbhiPostComments abhiPostComments = new QAbhiPostComments("abhi_post_comments");

    public final StringPath comments = createString("comments");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> postId = createNumber("postId", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QAbhiPostComments> primary = createPrimaryKey(id);

    public final com.querydsl.sql.ForeignKey<QAbhiPosts> fK1habgy1rd7a6aet5nevl6ao6q = createForeignKey(postId, "id");

    public QAbhiPostComments(String variable) {
        super(QAbhiPostComments.class, forVariable(variable), "null", "abhi_post_comments");
        addMetadata();
    }

    public QAbhiPostComments(String variable, String schema, String table) {
        super(QAbhiPostComments.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAbhiPostComments(String variable, String schema) {
        super(QAbhiPostComments.class, forVariable(variable), schema, "abhi_post_comments");
        addMetadata();
    }

    public QAbhiPostComments(Path<? extends QAbhiPostComments> path) {
        super(path.getType(), path.getMetadata(), "null", "abhi_post_comments");
        addMetadata();
    }

    public QAbhiPostComments(PathMetadata metadata) {
        super(QAbhiPostComments.class, metadata, "null", "abhi_post_comments");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(comments, ColumnMetadata.named("comments").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(postId, ColumnMetadata.named("post_id").withIndex(3).ofType(Types.INTEGER).withSize(10));
    }

}

