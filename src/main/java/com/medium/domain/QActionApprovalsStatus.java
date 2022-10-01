package com.medium.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QActionApprovalsStatus is a Querydsl query type for QActionApprovalsStatus
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QActionApprovalsStatus extends com.querydsl.sql.RelationalPathBase<QActionApprovalsStatus> {

    private static final long serialVersionUID = 449373625;

    public static final QActionApprovalsStatus actionApprovalsStatus = new QActionApprovalsStatus("action_approvals_status");

    public final DateTimePath<java.sql.Timestamp> createdAt = createDateTime("createdAt", java.sql.Timestamp.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public final DateTimePath<java.sql.Timestamp> updatedAt = createDateTime("updatedAt", java.sql.Timestamp.class);

    public final com.querydsl.sql.PrimaryKey<QActionApprovalsStatus> primary = createPrimaryKey(id);

    public final com.querydsl.sql.ForeignKey<QActionApprovals> _fKrv5ot6rj0de3oirpanoesnmim = createInvForeignKey(id, "approval_status_id");

    public QActionApprovalsStatus(String variable) {
        super(QActionApprovalsStatus.class, forVariable(variable), "null", "action_approvals_status");
        addMetadata();
    }

    public QActionApprovalsStatus(String variable, String schema, String table) {
        super(QActionApprovalsStatus.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QActionApprovalsStatus(String variable, String schema) {
        super(QActionApprovalsStatus.class, forVariable(variable), schema, "action_approvals_status");
        addMetadata();
    }

    public QActionApprovalsStatus(Path<? extends QActionApprovalsStatus> path) {
        super(path.getType(), path.getMetadata(), "null", "action_approvals_status");
        addMetadata();
    }

    public QActionApprovalsStatus(PathMetadata metadata) {
        super(QActionApprovalsStatus.class, metadata, "null", "action_approvals_status");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(createdAt, ColumnMetadata.named("created_at").withIndex(2).ofType(Types.TIMESTAMP).withSize(26).notNull());
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(updatedAt, ColumnMetadata.named("updated_at").withIndex(3).ofType(Types.TIMESTAMP).withSize(26));
    }

}

