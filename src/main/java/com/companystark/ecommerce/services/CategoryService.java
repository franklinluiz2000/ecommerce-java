package com.companystark.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.companystark.ecommerce.dto.CategoryDTO;
import com.companystark.ecommerce.entities.Category;
import com.companystark.ecommerce.repositories.CategoryRepository;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository repository;

    @Transactional(readOnly = true)
    public List<CategoryDTO> findAll() {
	List<Category> result = repository.findAll();
	return result.stream().map(x -> new CategoryDTO(x)).toList();
    }

}
