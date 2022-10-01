package com.medium.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QActionStatusTransition is a Querydsl query type for QActionStatusTransition
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QActionStatusTransition extends com.querydsl.sql.RelationalPathBase<QActionStatusTransition> {

    private static final long serialVersionUID = -376126800;

    public static final QActionStatusTransition actionStatusTransition = new QActionStatusTransition("action_status_transition");

    public final NumberPath<Long> actionId = createNumber("actionId", Long.class);

    public final NumberPath<Integer> actionStatusId = createNumber("actionStatusId", Integer.class);

    public final DateTimePath<java.sql.Timestamp> createdAt = createDateTime("createdAt", java.sql.Timestamp.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final DateTimePath<java.sql.Timestamp> updatedAt = createDateTime("updatedAt", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QActionStatusTransition> primary = createPrimaryKey(id);

    public final com.querydsl.sql.ForeignKey<QAction> fKbnddx781nfhlvtnlafbluq4ri = createForeignKey(actionId, "id");

    public final com.querydsl.sql.ForeignKey<QActionStatus> fKf8o0b114355yiq8ydws7l6gco = createForeignKey(actionStatusId, "id");

    public QActionStatusTransition(String variable) {
        super(QActionStatusTransition.class, forVariable(variable), "null", "action_status_transition");
        addMetadata();
    }

    public QActionStatusTransition(String variable, String schema, String table) {
        super(QActionStatusTransition.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QActionStatusTransition(String variable, String schema) {
        super(QActionStatusTransition.class, forVariable(variable), schema, "action_status_transition");
        addMetadata();
    }

    public QActionStatusTransition(Path<? extends QActionStatusTransition> path) {
        super(path.getType(), path.getMetadata(), "null", "action_status_transition");
        addMetadata();
    }

    public QActionStatusTransition(PathMetadata metadata) {
        super(QActionStatusTransition.class, metadata, "null", "action_status_transition");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(actionId, ColumnMetadata.named("action_id").withIndex(4).ofType(Types.BIGINT).withSize(19));
        addMetadata(actionStatusId, ColumnMetadata.named("action_status_id").withIndex(5).ofType(Types.INTEGER).withSize(10));
        addMetadata(createdAt, ColumnMetadata.named("created_at").withIndex(2).ofType(Types.TIMESTAMP).withSize(26).notNull());
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(updatedAt, ColumnMetadata.named("updated_at").withIndex(3).ofType(Types.TIMESTAMP).withSize(26));
    }

}

