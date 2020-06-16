package com.springboot.mongodb.api.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@Builder
@Document(collection = "PRODUCT")
@AllArgsConstructor
@RequiredArgsConstructor
public class Product {
	@Id
	private String id;
	@Field("PRODUCT_ID")
	private String productId;
	@Field("PRODUCT_NAME")
	private String productName;
	@Field("PRODUCT_TYPE")
	private String productType;
	@Field("PRODUCT_MAPD")
	private String productMapd;
	@Field("PRODUCT_EXPD")
	private String productExpd;
	@Field("PRODUCT_PRICE")
	private String productPrice;
	@Field("PRODUCT_QUANTITY")
	private String productQuantity;
	@Field("PRODUCT_USAGE")
	private String productUsage;

}
