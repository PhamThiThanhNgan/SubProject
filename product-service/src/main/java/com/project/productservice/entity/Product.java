package com.project.productservice.entity;

import lombok.*;

import javax.persistence.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String productName;
	private String skuCodeProduct;
	private String description;
	private String size;
	private Double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getSkuCodeProduct() {
		return skuCodeProduct;
	}

	public void setSkuCodeProduct(String skuCodeProduct) {
		this.skuCodeProduct = skuCodeProduct;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product(int id, String productName, String skuCodeProduct, String description, String size, Double price) {
		super();
		this.id = id;
		this.productName = productName;
		this.skuCodeProduct = skuCodeProduct;
		this.description = description;
		this.size = size;
		this.price = price;
	}

}
