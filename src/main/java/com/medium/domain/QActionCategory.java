package com.medium.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QActionCategory is a Querydsl query type for QActionCategory
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QActionCategory extends com.querydsl.sql.RelationalPathBase<QActionCategory> {

    private static final long serialVersionUID = 609158599;

    public static final QActionCategory actionCategory = new QActionCategory("action_category");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath name = createString("name");

    public final com.querydsl.sql.PrimaryKey<QActionCategory> primary = createPrimaryKey(id);

    public final com.querydsl.sql.ForeignKey<QActionApprovals> _fKefc15b6puqdttgacxjqmsnai8 = createInvForeignKey(id, "category_id");

    public QActionCategory(String variable) {
        super(QActionCategory.class, forVariable(variable), "null", "action_category");
        addMetadata();
    }

    public QActionCategory(String variable, String schema, String table) {
        super(QActionCategory.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QActionCategory(String variable, String schema) {
        super(QActionCategory.class, forVariable(variable), schema, "action_category");
        addMetadata();
    }

    public QActionCategory(Path<? extends QActionCategory> path) {
        super(path.getType(), path.getMetadata(), "null", "action_category");
        addMetadata();
    }

    public QActionCategory(PathMetadata metadata) {
        super(QActionCategory.class, metadata, "null", "action_category");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(name, ColumnMetadata.named("name").withIndex(2).ofType(Types.VARCHAR).withSize(255));
    }

}

