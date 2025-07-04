package com.companystark.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.companystark.ecommerce.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
