package org.zerock.orderpaymentex.domain;

import static com.querydsl.core.types.PathMetadataFactory.*;

import com.querydsl.core.types.dsl.*;

import com.querydsl.core.types.PathMetadata;
import javax.annotation.processing.Generated;
import com.querydsl.core.types.Path;


/**
 * QFoodItem is a Querydsl query type for FoodItem
 */
@Generated("com.querydsl.codegen.DefaultEntitySerializer")
public class QFoodItem extends EntityPathBase<FoodItem> {

    private static final long serialVersionUID = -1121031828L;

    public static final QFoodItem foodItem = new QFoodItem("foodItem");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public final StringPath name = createString("name");

    public final NumberPath<java.math.BigDecimal> price = createNumber("price", java.math.BigDecimal.class);

    public QFoodItem(String variable) {
        super(FoodItem.class, forVariable(variable));
    }

    public QFoodItem(Path<? extends FoodItem> path) {
        super(path.getType(), path.getMetadata());
    }

    public QFoodItem(PathMetadata metadata) {
        super(FoodItem.class, metadata);
    }

}

