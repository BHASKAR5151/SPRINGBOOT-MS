package com.example.product.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;


@Document(collection = "PRODUCT")
public class Product {
	@Id
	private String id;
	@Field("PRODUCT_ID")
	private String productId;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductType() {
		return productType;
	}
	public void setProductType(String productType) {
		this.productType = productType;
	}
	public String getProductMapd() {
		return productMapd;
	}
	public void setProductMapd(String productMapd) {
		this.productMapd = productMapd;
	}
	public String getProductExpd() {
		return productExpd;
	}
	public void setProductExpd(String productExpd) {
		this.productExpd = productExpd;
	}
	public String getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(String productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getProductUsage() {
		return productUsage;
	}
	public void setProductUsage(String productUsage) {
		this.productUsage = productUsage;
	}
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
