package com.medium.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QUserRoles is a Querydsl query type for QUserRoles
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QUserRoles extends com.querydsl.sql.RelationalPathBase<QUserRoles> {

    private static final long serialVersionUID = 1888297311;

    public static final QUserRoles userRoles = new QUserRoles("user_roles");

    public final DateTimePath<java.sql.Timestamp> createdAt = createDateTime("createdAt", java.sql.Timestamp.class);

    public final StringPath employeeId = createString("employeeId");

    public final StringPath roles = createString("roles");

    public final DateTimePath<java.sql.Timestamp> updatedAt = createDateTime("updatedAt", java.sql.Timestamp.class);

    public final StringPath username = createString("username");

    public final com.querydsl.sql.PrimaryKey<QUserRoles> primary = createPrimaryKey(employeeId);

    public QUserRoles(String variable) {
        super(QUserRoles.class, forVariable(variable), "null", "user_roles");
        addMetadata();
    }

    public QUserRoles(String variable, String schema, String table) {
        super(QUserRoles.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QUserRoles(String variable, String schema) {
        super(QUserRoles.class, forVariable(variable), schema, "user_roles");
        addMetadata();
    }

    public QUserRoles(Path<? extends QUserRoles> path) {
        super(path.getType(), path.getMetadata(), "null", "user_roles");
        addMetadata();
    }

    public QUserRoles(PathMetadata metadata) {
        super(QUserRoles.class, metadata, "null", "user_roles");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(createdAt, ColumnMetadata.named("created_at").withIndex(2).ofType(Types.TIMESTAMP).withSize(26).notNull());
        addMetadata(employeeId, ColumnMetadata.named("employee_id").withIndex(1).ofType(Types.VARCHAR).withSize(10).notNull());
        addMetadata(roles, ColumnMetadata.named("roles").withIndex(4).ofType(Types.LONGVARCHAR).withSize(1073741824));
        addMetadata(updatedAt, ColumnMetadata.named("updated_at").withIndex(3).ofType(Types.TIMESTAMP).withSize(26));
        addMetadata(username, ColumnMetadata.named("username").withIndex(5).ofType(Types.VARCHAR).withSize(255));
    }

}

