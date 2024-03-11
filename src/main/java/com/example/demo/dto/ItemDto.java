package com.example.demo.dto;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemDto {

	private Long id;
	private String name;
	private String description;
	private int itemInStock;
	private double printedPrice;
	private double price;
	private double sellDiscount;
	private double buyDiscount;
	private int quantuty;
	private String QRCode;
	private int defective;
	private Date expiration;
	private SupplierDto supplierDto;
	private BrandDto brandDto;
	private CategoryDto categoryDto;
}
