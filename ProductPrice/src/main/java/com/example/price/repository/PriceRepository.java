package com.example.price.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.price.model.Price;

@Repository
public interface PriceRepository extends MongoRepository<Price, Integer> {
	Optional<Price> findByProductId(String productId);
}
