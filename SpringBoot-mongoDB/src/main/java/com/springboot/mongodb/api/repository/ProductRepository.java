package com.springboot.mongodb.api.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.springboot.mongodb.api.model.Product;

@Repository
public interface ProductRepository extends MongoRepository<Product, Integer> {
	Optional<Product> findByProductId(String productId);
}
