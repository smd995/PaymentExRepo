package org.zerock.orderpaymentex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.orderpaymentex.domain.FoodItem;

public interface FoodItemRepository extends JpaRepository<FoodItem, Long> {
}
