package com.example.product.controller;

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
import org.springframework.web.client.RestTemplate;

import com.example.product.model.Price;
import com.example.product.model.Product;
import com.example.product.service.ProductService;

@RestController
@RequestMapping("/rest")
public class ProductController {

	@Autowired
	ProductService productService;

	@Autowired
	RestTemplate restTemplate;

	RestTemplate rs = new RestTemplate();

	@PostMapping("/product")
	void _saveProduct(@RequestBody Product product) {
		String url = "http://product-price/price/prodID/" + "dr123";
		System.out.println("Url @@@ : " + url);

		Price price = restTemplate.getForObject(url, Price.class);
		product.setProductPrice(price.getProductPrice());

		productService._saveProduct(product);
		System.out.println("product Details" + product);
	}

	@GetMapping("/productID/{productId}")
	ResponseEntity<Product> _getProduct(@PathVariable String productId) {
		System.out.println("WE ARE TRYONG TO GET PRODUCT");
		Optional<Product> product = productService._getProduct(productId);
		if (product.isPresent()) {
			return new ResponseEntity<Product>(product.get(), HttpStatus.OK);
		}
		return new ResponseEntity<Product>(HttpStatus.NOT_FOUND);
	}

}
