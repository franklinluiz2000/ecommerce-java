package com.companystark.ecommerce.dto;

import com.companystark.ecommerce.entities.Product;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public class ProductMinDTO {

    private Long id;

    @Size(min = 3, max = 80, message = "O nome precisa ter de 3 a 80 caracteres")
    @NotBlank(message = "Campo requerido")
    private String name;

    @Positive(message = "O preço deve ser positivo")
    private Double price;
    private String imgUrl;

    public ProductMinDTO() {

    }

    public ProductMinDTO(Long id, String name, String description, Double price, String imgUrl) {
	this.id = id;
	this.name = name;
	this.price = price;
	this.imgUrl = imgUrl;
    }

    public ProductMinDTO(Product entity) {
	id = entity.getId();
	name = entity.getName();
	price = entity.getPrice();
	imgUrl = entity.getImgUrl();
    }

    public Long getId() {
	return id;
    }

    public String getName() {
	return name;
    }

    public Double getPrice() {
	return price;
    }

    public String getImgUrl() {
	return imgUrl;
    }
}
