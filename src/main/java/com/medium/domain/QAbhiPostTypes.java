package com.medium.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;

import com.querydsl.sql.ColumnMetadata;
import java.sql.Types;




/**
 * QAbhiPostTypes is a Querydsl query type for QAbhiPostTypes
 */
@Generated("com.querydsl.sql.codegen.MetaDataSerializer")
public class QAbhiPostTypes extends com.querydsl.sql.RelationalPathBase<QAbhiPostTypes> {

    private static final long serialVersionUID = -1656797660;

    public static final QAbhiPostTypes abhiPostTypes = new QAbhiPostTypes("abhi_post_types");

    public final NumberPath<Integer> id = createNumber("id", Integer.class);

    public final StringPath type = createString("type");

    public final com.querydsl.sql.PrimaryKey<QAbhiPostTypes> primary = createPrimaryKey(id);

    public final com.querydsl.sql.ForeignKey<QAbhiPosts> _fKi2n6hhqbij7rgikhs1hax3yys = createInvForeignKey(id, "post_type_id");

    public QAbhiPostTypes(String variable) {
        super(QAbhiPostTypes.class, forVariable(variable), "null", "abhi_post_types");
        addMetadata();
    }

    public QAbhiPostTypes(String variable, String schema, String table) {
        super(QAbhiPostTypes.class, forVariable(variable), schema, table);
        addMetadata();
    }

    public QAbhiPostTypes(String variable, String schema) {
        super(QAbhiPostTypes.class, forVariable(variable), schema, "abhi_post_types");
        addMetadata();
    }

    public QAbhiPostTypes(Path<? extends QAbhiPostTypes> path) {
        super(path.getType(), path.getMetadata(), "null", "abhi_post_types");
        addMetadata();
    }

    public QAbhiPostTypes(PathMetadata metadata) {
        super(QAbhiPostTypes.class, metadata, "null", "abhi_post_types");
        addMetadata();
    }

    public void addMetadata() {
        addMetadata(id, ColumnMetadata.named("id").withIndex(1).ofType(Types.INTEGER).withSize(10).notNull());
        addMetadata(type, ColumnMetadata.named("type").withIndex(2).ofType(Types.VARCHAR).withSize(255));
    }

}

