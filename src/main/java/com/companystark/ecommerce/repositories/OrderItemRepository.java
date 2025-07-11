package com.companystark.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.companystark.ecommerce.entities.OrderItem;
import com.companystark.ecommerce.entities.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
}
