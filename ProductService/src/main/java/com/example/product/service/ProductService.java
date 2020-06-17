package com.example.product.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;

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
