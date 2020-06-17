package com.example.price.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.price.model.Price;
import com.example.price.repository.PriceRepository;

@Service
public class PriceService {
	@Autowired
	PriceRepository repository;

	public void _saveProductPrice(Price price) {
		repository.save(price);
	}

	public Optional<Price> _getProductPrice(String productId) {
		return repository.findByProductId(productId);
	}

}
