package com.springboot.mongodb.api.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mongodb.api.model.Product;
import com.springboot.mongodb.api.repository.ProductRepository;

@Service
public class ProductService {
	@Autowired
	ProductRepository repository;

	public void _saveProduct(Product product) {
		repository.save(product);
	}

	public Optional<Product> _getProduct(String productId) {
		return repository.findByProductId(productId);
	}

}
