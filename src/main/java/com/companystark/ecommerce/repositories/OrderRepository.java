package com.companystark.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.companystark.ecommerce.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
