package com.medium.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAbhiUsers is a Querydsl query type for QAbhiUsers
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAbhiUsers extends com.querydsl.sql.RelationalPathBase<QAbhiUsers> {

    private static final long serialVersionUID = -2067558925;

    public static final QAbhiUsers abhiUsers = new QAbhiUsers("abhi_users");

    public final StringPath email = createString("email");

    public final StringPath fullName = createString("fullName");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final BooleanPath isActive = createBoolean("isActive");

    public final StringPath userName = createString("userName");

    public final com.querydsl.sql.PrimaryKey<QAbhiUsers> primary = createPrimaryKey(id);

    public final com.querydsl.sql.ForeignKey<QAbhiPosts> _fKb8h1k77h6jx5ytw7q9ffjvfr9 = createInvForeignKey(id, "author_id");

    public QAbhiUsers(String variable) {
        super(QAbhiUsers.class, forVariable(variable), "null", "abhi_users");
        addMetadata();
    }

    public QAbhiUsers(String variable, String schema, String table) {
        super(QAbhiUsers.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAbhiUsers(String variable, String schema) {
        super(QAbhiUsers.class, forVariable(variable), schema, "abhi_users");
        addMetadata();
    }

    public QAbhiUsers(Path<? extends QAbhiUsers> path) {
        super(path.getType(), path.getMetadata(), "null", "abhi_users");
        addMetadata();
    }

    public QAbhiUsers(PathMetadata metadata) {
        super(QAbhiUsers.class, metadata, "null", "abhi_users");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(email, ColumnMetadata.named("email").withIndex(2).ofType(Types.VARCHAR).withSize(255));
        addMetadata(fullName, ColumnMetadata.named("full_name").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(isActive, ColumnMetadata.named("is_active").withIndex(4).ofType(Types.BIT).withSize(1));
        addMetadata(userName, ColumnMetadata.named("user_name").withIndex(5).ofType(Types.VARCHAR).withSize(255));
    }

}

