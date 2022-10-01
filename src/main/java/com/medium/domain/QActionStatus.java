package com.medium.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QActionStatus is a Querydsl query type for QActionStatus
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QActionStatus extends com.querydsl.sql.RelationalPathBase<QActionStatus> {

    private static final long serialVersionUID = 1324857083;

    public static final QActionStatus actionStatus = new QActionStatus("action_status");

    public final DateTimePath<java.sql.Timestamp> createdAt = createDateTime("createdAt", java.sql.Timestamp.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath stageName = createString("stageName");

    public final StringPath statusName = createString("statusName");

    public final DateTimePath<java.sql.Timestamp> updatedAt = createDateTime("updatedAt", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QActionStatus> primary = createPrimaryKey(id);

    public final com.querydsl.sql.ForeignKey<QActionStatusTransition> _fKf8o0b114355yiq8ydws7l6gco = createInvForeignKey(id, "action_status_id");

    public final com.querydsl.sql.ForeignKey<QAction> _fKslbmkmfn1nklj4dcmg6ifnog2 = createInvForeignKey(id, "action_status_id");

    public QActionStatus(String variable) {
        super(QActionStatus.class, forVariable(variable), "null", "action_status");
        addMetadata();
    }

    public QActionStatus(String variable, String schema, String table) {
        super(QActionStatus.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QActionStatus(String variable, String schema) {
        super(QActionStatus.class, forVariable(variable), schema, "action_status");
        addMetadata();
    }

    public QActionStatus(Path<? extends QActionStatus> path) {
        super(path.getType(), path.getMetadata(), "null", "action_status");
        addMetadata();
    }

    public QActionStatus(PathMetadata metadata) {
        super(QActionStatus.class, metadata, "null", "action_status");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(createdAt, ColumnMetadata.named("created_at").withIndex(2).ofType(Types.TIMESTAMP).withSize(26).notNull());
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(stageName, ColumnMetadata.named("stage_name").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(statusName, ColumnMetadata.named("status_name").withIndex(5).ofType(Types.VARCHAR).withSize(255));
        addMetadata(updatedAt, ColumnMetadata.named("updated_at").withIndex(3).ofType(Types.TIMESTAMP).withSize(26));
    }

}

