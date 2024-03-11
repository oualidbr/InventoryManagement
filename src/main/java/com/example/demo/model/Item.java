package com.example.demo.model;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Item {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id ;
	private String name;
	private String description ;
	private int itemInStock;
	private double printedPrice;
	private double price ;
	private double sellDiscount;
	private double buyDiscount;
	private int quantuty;
	private String QRCode;
	private int defective;
	private Date expiration;
	@ManyToOne
	private Supplier supplier;
	@ManyToOne
	private Brand brand;
	@ManyToOne
	private Category category;
	
}
