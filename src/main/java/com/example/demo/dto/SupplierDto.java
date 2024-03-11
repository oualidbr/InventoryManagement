package com.example.demo.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class SupplierDto {
	private Long id;
	private String firstName;
	private String lastName;
	private String mobile;
	private String email;
	private AddressDto addressDto;
}
