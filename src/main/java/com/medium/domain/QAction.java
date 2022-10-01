package com.medium.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAction is a Querydsl query type for QAction
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAction extends com.querydsl.sql.RelationalPathBase<QAction> {

    private static final long serialVersionUID = 87137705;

    public static final QAction action = new QAction("action");

    public final NumberPath<Integer> actionStatusId = createNumber("actionStatusId", Integer.class);

    public final StringPath businessUnit = createString("businessUnit");

    public final DateTimePath<java.sql.Timestamp> createdAt = createDateTime("createdAt", java.sql.Timestamp.class);

    public final StringPath createdBy = createString("createdBy");

    public final StringPath description = createString("description");

    public final NumberPath<Long> executionId = createNumber("executionId", Long.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath initiatorName = createString("initiatorName");

    public final DatePath<java.sql.Date> targetNotificationDate = createDate("targetNotificationDate", java.sql.Date.class);

    public final DateTimePath<java.sql.Timestamp> updatedAt = createDateTime("updatedAt", java.sql.Timestamp.class);

    public final StringPath updatedBy = createString("updatedBy");

    public final NumberPath<Long> workflowId = createNumber("workflowId", Long.class);

    public final com.querydsl.sql.PrimaryKey<QAction> primary = createPrimaryKey(id);

    public final com.querydsl.sql.ForeignKey<QActionStatus> fKslbmkmfn1nklj4dcmg6ifnog2 = createForeignKey(actionStatusId, "id");

    public final com.querydsl.sql.ForeignKey<QActionStatusTransition> _fKbnddx781nfhlvtnlafbluq4ri = createInvForeignKey(id, "action_id");

    public final com.querydsl.sql.ForeignKey<QActionFiles> _fKmewgks3is4avafnqr0ilr29x4 = createInvForeignKey(id, "action_id");

    public final com.querydsl.sql.ForeignKey<QActionComments> _fKn3kkjy8g8ch8ytu7a5f8mu9af = createInvForeignKey(id, "action_id");

    public final com.querydsl.sql.ForeignKey<QActionApprovals> _fKq40i45eq53c1ehii0libx1qjh = createInvForeignKey(id, "action_id");

    public final com.querydsl.sql.ForeignKey<QActionAudit> _fKt2h34qupss3svx5ay5s03bt98 = createInvForeignKey(id, "action_id");

    public QAction(String variable) {
        super(QAction.class, forVariable(variable), "null", "action");
        addMetadata();
    }

    public QAction(String variable, String schema, String table) {
        super(QAction.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAction(String variable, String schema) {
        super(QAction.class, forVariable(variable), schema, "action");
        addMetadata();
    }

    public QAction(Path<? extends QAction> path) {
        super(path.getType(), path.getMetadata(), "null", "action");
        addMetadata();
    }

    public QAction(PathMetadata metadata) {
        super(QAction.class, metadata, "null", "action");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(actionStatusId, ColumnMetadata.named("action_status_id").withIndex(12).ofType(Types.INTEGER).withSize(10));
        addMetadata(businessUnit, ColumnMetadata.named("business_unit").withIndex(6).ofType(Types.VARCHAR).withSize(255));
        addMetadata(createdAt, ColumnMetadata.named("created_at").withIndex(2).ofType(Types.TIMESTAMP).withSize(26).notNull());
        addMetadata(createdBy, ColumnMetadata.named("created_by").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(description, ColumnMetadata.named("description").withIndex(7).ofType(Types.VARCHAR).withSize(255));
        addMetadata(executionId, ColumnMetadata.named("execution_id").withIndex(8).ofType(Types.BIGINT).withSize(19));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(initiatorName, ColumnMetadata.named("initiator_name").withIndex(9).ofType(Types.VARCHAR).withSize(255));
        addMetadata(targetNotificationDate, ColumnMetadata.named("target_notification_date").withIndex(10).ofType(Types.DATE).withSize(10));
        addMetadata(updatedAt, ColumnMetadata.named("updated_at").withIndex(4).ofType(Types.TIMESTAMP).withSize(26));
        addMetadata(updatedBy, ColumnMetadata.named("updated_by").withIndex(5).ofType(Types.VARCHAR).withSize(255));
        addMetadata(workflowId, ColumnMetadata.named("workflow_id").withIndex(11).ofType(Types.BIGINT).withSize(19));
    }

}

