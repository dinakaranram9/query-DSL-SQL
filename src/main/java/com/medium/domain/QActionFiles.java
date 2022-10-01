package com.medium.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QActionFiles is a Querydsl query type for QActionFiles
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QActionFiles extends com.querydsl.sql.RelationalPathBase<QActionFiles> {

    private static final long serialVersionUID = -1632154034;

    public static final QActionFiles actionFiles = new QActionFiles("action_files");

    public final NumberPath<Long> actionId = createNumber("actionId", Long.class);

    public final NumberPath<Integer> category = createNumber("category", Integer.class);

    public final DateTimePath<java.sql.Timestamp> createdAt = createDateTime("createdAt", java.sql.Timestamp.class);

    public final StringPath fileUrl = createString("fileUrl");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final NumberPath<Integer> userId = createNumber("userId", Integer.class);

    public final com.querydsl.sql.PrimaryKey<QActionFiles> primary = createPrimaryKey(id);

    public final com.querydsl.sql.ForeignKey<QAction> fKmewgks3is4avafnqr0ilr29x4 = createForeignKey(actionId, "id");

    public final com.querydsl.sql.ForeignKey<QUsers> fKr951w9510m28l7is1kljry08p = createForeignKey(userId, "id");

    public QActionFiles(String variable) {
        super(QActionFiles.class, forVariable(variable), "null", "action_files");
        addMetadata();
    }

    public QActionFiles(String variable, String schema, String table) {
        super(QActionFiles.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QActionFiles(String variable, String schema) {
        super(QActionFiles.class, forVariable(variable), schema, "action_files");
        addMetadata();
    }

    public QActionFiles(Path<? extends QActionFiles> path) {
        super(path.getType(), path.getMetadata(), "null", "action_files");
        addMetadata();
    }

    public QActionFiles(PathMetadata metadata) {
        super(QActionFiles.class, metadata, "null", "action_files");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(actionId, ColumnMetadata.named("action_id").withIndex(5).ofType(Types.BIGINT).withSize(19));
        addMetadata(category, ColumnMetadata.named("category").withIndex(3).ofType(Types.INTEGER).withSize(10));
        addMetadata(createdAt, ColumnMetadata.named("created_at").withIndex(2).ofType(Types.TIMESTAMP).withSize(26).notNull());
        addMetadata(fileUrl, ColumnMetadata.named("file_url").withIndex(4).ofType(Types.LONGVARCHAR).withSize(65535));
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(userId, ColumnMetadata.named("user_id").withIndex(6).ofType(Types.INTEGER).withSize(10));
    }

}

