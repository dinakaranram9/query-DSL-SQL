package com.medium.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QActionApprovals is a Querydsl query type for QActionApprovals
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QActionApprovals extends com.querydsl.sql.RelationalPathBase<QActionApprovals> {

    private static final long serialVersionUID = -1773915417;

    public static final QActionApprovals actionApprovals = new QActionApprovals("action_approvals");

    public final NumberPath<Long> actionId = createNumber("actionId", Long.class);

    public final NumberPath<Integer> approvalStatusId = createNumber("approvalStatusId", Integer.class);

    public final StringPath approverUsername = createString("approverUsername");

    public final NumberPath<Integer> categoryId = createNumber("categoryId", Integer.class);

    public final DateTimePath<java.sql.Timestamp> createdAt = createDateTime("createdAt", java.sql.Timestamp.class);

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath roleType = createString("roleType");

    public final DateTimePath<java.sql.Timestamp> updatedAt = createDateTime("updatedAt", java.sql.Timestamp.class);

    public final BooleanPath valid = createBoolean("valid");

    public final com.querydsl.sql.PrimaryKey<QActionApprovals> primary = createPrimaryKey(id);

    public final com.querydsl.sql.ForeignKey<QActionCategory> fKefc15b6puqdttgacxjqmsnai8 = createForeignKey(categoryId, "id");

    public final com.querydsl.sql.ForeignKey<QAction> fKq40i45eq53c1ehii0libx1qjh = createForeignKey(actionId, "id");

    public final com.querydsl.sql.ForeignKey<QActionApprovalsStatus> fKrv5ot6rj0de3oirpanoesnmim = createForeignKey(approvalStatusId, "id");

    public QActionApprovals(String variable) {
        super(QActionApprovals.class, forVariable(variable), "null", "action_approvals");
        addMetadata();
    }

    public QActionApprovals(String variable, String schema, String table) {
        super(QActionApprovals.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QActionApprovals(String variable, String schema) {
        super(QActionApprovals.class, forVariable(variable), schema, "action_approvals");
        addMetadata();
    }

    public QActionApprovals(Path<? extends QActionApprovals> path) {
        super(path.getType(), path.getMetadata(), "null", "action_approvals");
        addMetadata();
    }

    public QActionApprovals(PathMetadata metadata) {
        super(QActionApprovals.class, metadata, "null", "action_approvals");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(actionId, ColumnMetadata.named("action_id").withIndex(7).ofType(Types.BIGINT).withSize(19));
        addMetadata(approvalStatusId, ColumnMetadata.named("approval_status_id").withIndex(8).ofType(Types.INTEGER).withSize(10));
        addMetadata(approverUsername, ColumnMetadata.named("approver_username").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(categoryId, ColumnMetadata.named("category_id").withIndex(9).ofType(Types.INTEGER).withSize(10));
        addMetadata(createdAt, ColumnMetadata.named("created_at").withIndex(2).ofType(Types.TIMESTAMP).withSize(26).notNull());
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.BIGINT).withSize(19).notNull());
        addMetadata(roleType, ColumnMetadata.named("role_type").withIndex(5).ofType(Types.VARCHAR).withSize(255));
        addMetadata(updatedAt, ColumnMetadata.named("updated_at").withIndex(3).ofType(Types.TIMESTAMP).withSize(26));
        addMetadata(valid, ColumnMetadata.named("valid").withIndex(6).ofType(Types.BIT).withSize(1));
    }

}

