package com.brandon.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Product_MVC")
public class ProductBean {
	@Id
	private int prdId;
	@Column(name = "product_name")
	private String prdName;
	private long prdPrice;

}
