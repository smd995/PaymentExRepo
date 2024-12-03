package org.zerock.orderpaymentex.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.zerock.orderpaymentex.domain.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}