package com.medium.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSuccessDetails is a Querydsl query type for QSuccessDetails
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSuccessDetails extends com.querydsl.sql.RelationalPathBase<QSuccessDetails> {

    private static final long serialVersionUID = -2000106190;

    public static final QSuccessDetails successDetails = new QSuccessDetails("success_details");

    public final StringPath agreementNumber = createString("agreementNumber");

    public final DateTimePath<java.sql.Timestamp> createdAt = createDateTime("createdAt", java.sql.Timestamp.class);

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath title = createString("title");

    public final com.querydsl.sql.PrimaryKey<QSuccessDetails> primary = createPrimaryKey(id);

    public QSuccessDetails(String variable) {
        super(QSuccessDetails.class, forVariable(variable), "null", "success_details");
        addMetadata();
    }

    public QSuccessDetails(String variable, String schema, String table) {
        super(QSuccessDetails.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSuccessDetails(String variable, String schema) {
        super(QSuccessDetails.class, forVariable(variable), schema, "success_details");
        addMetadata();
    }

    public QSuccessDetails(Path<? extends QSuccessDetails> path) {
        super(path.getType(), path.getMetadata(), "null", "success_details");
        addMetadata();
    }

    public QSuccessDetails(PathMetadata metadata) {
        super(QSuccessDetails.class, metadata, "null", "success_details");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(agreementNumber, ColumnMetadata.named("agreement_number").withIndex(3).ofType(Types.VARCHAR).withSize(255));
        addMetadata(createdAt, ColumnMetadata.named("created_at").withIndex(2).ofType(Types.TIMESTAMP).withSize(26).notNull());
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(title, ColumnMetadata.named("title").withIndex(4).ofType(Types.VARCHAR).withSize(255));
    }

}

