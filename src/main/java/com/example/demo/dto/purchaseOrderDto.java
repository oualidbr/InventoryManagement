package com.example.demo.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class purchaseOrderDto {

	private Long id;
	private double totalPrice;
	private String status;
	private Date orderDate;
	private Set<ItemOrderDto> itemOrderDtos = new HashSet<>();
	private UserDto userDto;
}
