package com.medium.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QErrorIdSeq is a Querydsl query type for QErrorIdSeq
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QErrorIdSeq extends com.querydsl.sql.RelationalPathBase<QErrorIdSeq> {

    private static final long serialVersionUID = -1535652337;

    public static final QErrorIdSeq errorIdSeq = new QErrorIdSeq("error_id_seq");

    public final NumberPath<Long> nextVal = createNumber("nextVal", Long.class);

    public QErrorIdSeq(String variable) {
        super(QErrorIdSeq.class, forVariable(variable), "null", "error_id_seq");
        addMetadata();
    }

    public QErrorIdSeq(String variable, String schema, String table) {
        super(QErrorIdSeq.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QErrorIdSeq(String variable, String schema) {
        super(QErrorIdSeq.class, forVariable(variable), schema, "error_id_seq");
        addMetadata();
    }

    public QErrorIdSeq(Path<? extends QErrorIdSeq> path) {
        super(path.getType(), path.getMetadata(), "null", "error_id_seq");
        addMetadata();
    }

    public QErrorIdSeq(PathMetadata metadata) {
        super(QErrorIdSeq.class, metadata, "null", "error_id_seq");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(nextVal, ColumnMetadata.named("next_val").withIndex(1).ofType(Types.BIGINT).withSize(19));
    }

}

