package com.restapi.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Product_Config")
public class ProductConfig {
	
	@Id
	private int configId;
	@Column
	private String osDetail;
	@Column
	private int productId;
	
	public int getConfigId() {
		return configId;
	}
	public void setConfigId(int configId) {
		this.configId = configId;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getOsDetail() {
		return osDetail;
	}
	public void setOsDetail(String osDetail) {
		this.osDetail = osDetail;
	}

}
