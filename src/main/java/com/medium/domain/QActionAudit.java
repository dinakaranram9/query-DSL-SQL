package com.medium.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QActionAudit is a Querydsl query type for QActionAudit
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QActionAudit extends com.querydsl.sql.RelationalPathBase<QActionAudit> {

    private static final long serialVersionUID = -1636421710;

    public static final QActionAudit actionAudit = new QActionAudit("action_audit");

    public final NumberPath<Long> actionId = createNumber("actionId", Long.class);

    public final StringPath activity = createString("activity");

    public final DateTimePath<java.sql.Timestamp> createdAt = createDateTime("createdAt", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final DateTimePath<java.sql.Timestamp> updatedAt = createDateTime("updatedAt", java.sql.Timestamp.class);

    public final NumberPath<Integer> userId = createNumber("userId", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QActionAudit> primary = createPrimaryKey(id);

    public final com.querydsl.sql.ForeignKey<QUsers> fKi38ydfl3008sw4gppe4n9d929 = createForeignKey(userId, "id");

    public final com.querydsl.sql.ForeignKey<QAction> fKt2h34qupss3svx5ay5s03bt98 = createForeignKey(actionId, "id");

    public QActionAudit(String variable) {
        super(QActionAudit.class, forVariable(variable), "null", "action_audit");
        addMetadata();
    }

    public QActionAudit(String variable, String schema, String table) {
        super(QActionAudit.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QActionAudit(String variable, String schema) {
        super(QActionAudit.class, forVariable(variable), schema, "action_audit");
        addMetadata();
    }

    public QActionAudit(Path<? extends QActionAudit> path) {
        super(path.getType(), path.getMetadata(), "null", "action_audit");
        addMetadata();
    }

    public QActionAudit(PathMetadata metadata) {
        super(QActionAudit.class, metadata, "null", "action_audit");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(actionId, ColumnMetadata.named("action_id").withIndex(5).ofType(Types.BIGINT).withSize(19));
        addMetadata(activity, ColumnMetadata.named("activity").withIndex(4).ofType(Types.LONGVARCHAR).withSize(65535));
        addMetadata(createdAt, ColumnMetadata.named("created_at").withIndex(2).ofType(Types.TIMESTAMP).withSize(26).notNull());
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(updatedAt, ColumnMetadata.named("updated_at").withIndex(3).ofType(Types.TIMESTAMP).withSize(26));
        addMetadata(userId, ColumnMetadata.named("user_id").withIndex(6).ofType(Types.INTEGER).withSize(10));
    }

}

