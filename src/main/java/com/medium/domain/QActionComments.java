package com.medium.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QActionComments is a Querydsl query type for QActionComments
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QActionComments extends com.querydsl.sql.RelationalPathBase<QActionComments> {

    private static final long serialVersionUID = -43768131;

    public static final QActionComments actionComments = new QActionComments("action_comments");

    public final NumberPath<Long> actionId = createNumber("actionId", Long.class);

    public final NumberPath<Integer> category = createNumber("category", Integer.class);

    public final StringPath comment = createString("comment");

    public final DateTimePath<java.sql.Timestamp> createdAt = createDateTime("createdAt", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final NumberPath<Integer> userId = createNumber("userId", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QActionComments> primary = createPrimaryKey(id);

    public final com.querydsl.sql.ForeignKey<QUsers> fKkrxupq0isuns64jlaiixyshd3 = createForeignKey(userId, "id");

    public final com.querydsl.sql.ForeignKey<QAction> fKn3kkjy8g8ch8ytu7a5f8mu9af = createForeignKey(actionId, "id");

    public QActionComments(String variable) {
        super(QActionComments.class, forVariable(variable), "null", "action_comments");
        addMetadata();
    }

    public QActionComments(String variable, String schema, String table) {
        super(QActionComments.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QActionComments(String variable, String schema) {
        super(QActionComments.class, forVariable(variable), schema, "action_comments");
        addMetadata();
    }

    public QActionComments(Path<? extends QActionComments> path) {
        super(path.getType(), path.getMetadata(), "null", "action_comments");
        addMetadata();
    }

    public QActionComments(PathMetadata metadata) {
        super(QActionComments.class, metadata, "null", "action_comments");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(actionId, ColumnMetadata.named("action_id").withIndex(5).ofType(Types.BIGINT).withSize(19));
        addMetadata(category, ColumnMetadata.named("category").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(comment, ColumnMetadata.named("comment").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(createdAt, ColumnMetadata.named("created_at").withIndex(2).ofType(Types.TIMESTAMP).withSize(26).notNull());
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(userId, ColumnMetadata.named("user_id").withIndex(6).ofType(Types.INTEGER).withSize(10));
    }

}

