package com.medium.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAbhiPosts is a Querydsl query type for QAbhiPosts
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAbhiPosts extends com.querydsl.sql.RelationalPathBase<QAbhiPosts> {

    private static final long serialVersionUID = -2072282178;

    public static final QAbhiPosts abhiPosts = new QAbhiPosts("abhi_posts");

    public final NumberPath<Integer> authorId = createNumber("authorId", Integer.class);

    public final DateTimePath<java.sql.Timestamp> createdAt = createDateTime("createdAt", java.sql.Timestamp.class);

    public final StringPath createdBy = createString("createdBy");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> postTypeId = createNumber("postTypeId", Integer.class);

    public final StringPath title = createString("title");

    public final DateTimePath<java.sql.Timestamp> updatedAt = createDateTime("updatedAt", java.sql.Timestamp.class);

    public final StringPath updatedBy = createString("updatedBy");

    public final com.querydsl.sql.PrimaryKey<QAbhiPosts> primary = createPrimaryKey(id);

    public final com.querydsl.sql.ForeignKey<QAbhiUsers> fKb8h1k77h6jx5ytw7q9ffjvfr9 = createForeignKey(authorId, "id");

    public final com.querydsl.sql.ForeignKey<QAbhiPostTypes> fKi2n6hhqbij7rgikhs1hax3yys = createForeignKey(postTypeId, "id");

    public final com.querydsl.sql.ForeignKey<QAbhiPostComments> _fK1habgy1rd7a6aet5nevl6ao6q = createInvForeignKey(id, "post_id");

    public QAbhiPosts(String variable) {
        super(QAbhiPosts.class, forVariable(variable), "null", "abhi_posts");
        addMetadata();
    }

    public QAbhiPosts(String variable, String schema, String table) {
        super(QAbhiPosts.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAbhiPosts(String variable, String schema) {
        super(QAbhiPosts.class, forVariable(variable), schema, "abhi_posts");
        addMetadata();
    }

    public QAbhiPosts(Path<? extends QAbhiPosts> path) {
        super(path.getType(), path.getMetadata(), "null", "abhi_posts");
        addMetadata();
    }

    public QAbhiPosts(PathMetadata metadata) {
        super(QAbhiPosts.class, metadata, "null", "abhi_posts");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(authorId, ColumnMetadata.named("author_id").withIndex(7).ofType(Types.INTEGER).withSize(10));
        addMetadata(createdAt, ColumnMetadata.named("created_at").withIndex(2).ofType(Types.TIMESTAMP).withSize(26).notNull());
        addMetadata(createdBy, ColumnMetadata.named("created_by").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(postTypeId, ColumnMetadata.named("post_type_id").withIndex(8).ofType(Types.INTEGER).withSize(10));
        addMetadata(title, ColumnMetadata.named("title").withIndex(6).ofType(Types.VARCHAR).withSize(255));
        addMetadata(updatedAt, ColumnMetadata.named("updated_at").withIndex(4).ofType(Types.TIMESTAMP).withSize(26));
        addMetadata(updatedBy, ColumnMetadata.named("updated_by").withIndex(5).ofType(Types.VARCHAR).withSize(255));
    }

}

