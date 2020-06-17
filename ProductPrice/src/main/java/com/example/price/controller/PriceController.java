package com.example.price.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.price.model.Price;
import com.example.price.service.PriceService;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/price")
public class PriceController {

	@Autowired
	PriceService productService;
	@ApiOperation("Save Price")
	@PostMapping("/product")
	void _savePrice(@RequestBody Price product) {
		productService._saveProductPrice(product);
		System.out.println("product Details" + product);
	}

	@GetMapping("/prodID/{pId}")
	ResponseEntity<Price> _getPrice(@PathVariable String pId) {
		System.out.println("WE ARE TRYONG TO GET PRODUCT");
		Optional<Price> product = productService._getProductPrice(pId);
		if (product.isPresent()) {
			return new ResponseEntity<Price>(product.get(), HttpStatus.OK);
		}
		return new ResponseEntity<Price>(HttpStatus.NOT_FOUND);
	}

}
