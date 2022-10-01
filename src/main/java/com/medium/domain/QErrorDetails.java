package com.medium.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QErrorDetails is a Querydsl query type for QErrorDetails
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QErrorDetails extends com.querydsl.sql.RelationalPathBase<QErrorDetails> {

    private static final long serialVersionUID = 1623284813;

    public static final QErrorDetails errorDetails = new QErrorDetails("error_details");

    public final StringPath agreementId = createString("agreementId");

    public final DateTimePath<java.sql.Timestamp> createdAt = createDateTime("createdAt", java.sql.Timestamp.class);

    public final StringPath errorMessage = createString("errorMessage");

    public final StringPath errorType = createString("errorType");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath occuredAt = createString("occuredAt");

    public final com.querydsl.sql.PrimaryKey<QErrorDetails> primary = createPrimaryKey(id);

    public QErrorDetails(String variable) {
        super(QErrorDetails.class, forVariable(variable), "null", "error_details");
        addMetadata();
    }

    public QErrorDetails(String variable, String schema, String table) {
        super(QErrorDetails.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QErrorDetails(String variable, String schema) {
        super(QErrorDetails.class, forVariable(variable), schema, "error_details");
        addMetadata();
    }

    public QErrorDetails(Path<? extends QErrorDetails> path) {
        super(path.getType(), path.getMetadata(), "null", "error_details");
        addMetadata();
    }

    public QErrorDetails(PathMetadata metadata) {
        super(QErrorDetails.class, metadata, "null", "error_details");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(agreementId, ColumnMetadata.named("agreement_id").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(createdAt, ColumnMetadata.named("created_at").withIndex(2).ofType(Types.TIMESTAMP).withSize(26).notNull());
        addMetadata(errorMessage, ColumnMetadata.named("error_message").withIndex(4).ofType(Types.VARCHAR).withSize(255));
        addMetadata(errorType, ColumnMetadata.named("error_type").withIndex(5).ofType(Types.VARCHAR).withSize(255));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(occuredAt, ColumnMetadata.named("occured_at").withIndex(6).ofType(Types.VARCHAR).withSize(255));
    }

}

