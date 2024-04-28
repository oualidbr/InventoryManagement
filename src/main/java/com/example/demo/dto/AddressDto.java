package com.example.demo.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AddressDto {
	private Long id;
	@NotBlank(message = "Addres cant be Balank")
	private String line1;
	private String line2;
	@NotBlank(message = "city cant be Balank")
	private String city;
	private String province;
	@NotBlank(message = "country cant be Balank")
	private String country;
}
