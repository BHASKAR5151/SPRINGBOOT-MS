package com.example.price.service;

import static org.mockito.Mockito.when;

import java.util.Optional;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.price.model.Price;
import com.example.price.repository.PriceRepository;

@ExtendWith(MockitoExtension.class)
public class PriceServiceTests {
	@Mock
	PriceRepository repository;

	@InjectMocks
	PriceService priceService;

	Price responsePrice;

	@BeforeEach
	public void setUp() {
		responsePrice = new Price();
		responsePrice.setProductId("16");
		responsePrice.setProductPrice("245");

	}

	@Test
	public void _saveProductPriceTest() {
		Price request = new Price();
		request.setProductId("123");
		request.setProductPrice("25000");
		when(repository.save(request)).thenReturn(responsePrice);
		Price response= priceService._saveProductPrice(request);
		Assertions.assertEquals(responsePrice, response);
	}

	
	@Test
	public void _getProductPriceTest() {
		Optional<Price> exepeted=Optional.of(responsePrice);
		String prodId="123";
		when(repository.findByProductId(prodId)).thenReturn(exepeted);
		Optional<Price> response= priceService._getProductPrice(prodId);
		Assertions.assertEquals(response, response);
	}
}
