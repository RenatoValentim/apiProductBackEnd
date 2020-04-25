package com.product.apiproduct.repository;

import com.product.apiproduct.models.Product;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}