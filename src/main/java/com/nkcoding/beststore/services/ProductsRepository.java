package com.nkcoding.beststore.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nkcoding.beststore.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
