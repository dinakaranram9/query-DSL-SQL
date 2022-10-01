package com.medium.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QSuccessIdSeq is a Querydsl query type for QSuccessIdSeq
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QSuccessIdSeq extends com.querydsl.sql.RelationalPathBase<QSuccessIdSeq> {

    private static final long serialVersionUID = -855624652;

    public static final QSuccessIdSeq successIdSeq = new QSuccessIdSeq("success_id_seq");

    public final NumberPath<Long> nextVal = createNumber("nextVal", Long.class);

    public QSuccessIdSeq(String variable) {
        super(QSuccessIdSeq.class, forVariable(variable), "null", "success_id_seq");
        addMetadata();
    }

    public QSuccessIdSeq(String variable, String schema, String table) {
        super(QSuccessIdSeq.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QSuccessIdSeq(String variable, String schema) {
        super(QSuccessIdSeq.class, forVariable(variable), schema, "success_id_seq");
        addMetadata();
    }

    public QSuccessIdSeq(Path<? extends QSuccessIdSeq> path) {
        super(path.getType(), path.getMetadata(), "null", "success_id_seq");
        addMetadata();
    }

    public QSuccessIdSeq(PathMetadata metadata) {
        super(QSuccessIdSeq.class, metadata, "null", "success_id_seq");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(nextVal, ColumnMetadata.named("next_val").withIndex(1).ofType(Types.BIGINT).withSize(19));
    }

}

