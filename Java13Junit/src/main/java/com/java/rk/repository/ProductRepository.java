package com.java.rk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.java.rk.model.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
