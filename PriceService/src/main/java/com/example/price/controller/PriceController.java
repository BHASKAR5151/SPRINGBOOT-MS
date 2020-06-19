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
@RequestMapping("/priceController")
public class PriceController {

	@Autowired
	PriceService productService;

	@ApiOperation("Save Price")
	@PostMapping("/product")
	ResponseEntity<Price> _savePrice(@RequestBody Price price) {
		Price price1=productService._saveProductPrice(price);
		System.out.println("product Details" + price);
		return new ResponseEntity<Price>(price1, HttpStatus.OK);
	}

	@GetMapping("/prodID/{pId}")
	ResponseEntity<Price> _getPrice(@PathVariable String pId) {
		System.out.println("WE ARE TRYONG TO GET PRICE");
		Optional<Price> product = productService._getProductPrice(pId);
		//Optional<String> p=Optional.empty();
		if (product.isPresent()) {
			return new ResponseEntity<Price>(product.get(), HttpStatus.OK);
		}
		return new ResponseEntity<Price>(HttpStatus.NOT_FOUND);
	}
}
