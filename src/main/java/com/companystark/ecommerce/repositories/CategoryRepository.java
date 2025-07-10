package com.companystark.ecommerce.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.companystark.ecommerce.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
