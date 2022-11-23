package com.project.inventoryservice.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "inventory")
public class Inventory {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String skuCodeProduct;
	private String productName;
	private int quantity;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSkuCodeProduct() {
		return skuCodeProduct;
	}

	public void setSkuCodeProduct(String skuCodeProduct) {
		this.skuCodeProduct = skuCodeProduct;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
