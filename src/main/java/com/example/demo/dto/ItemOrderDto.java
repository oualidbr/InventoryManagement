package com.example.demo.dto;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ItemOrderDto {

	   private Long id;

	    @DecimalMin(value = "0.1", message = "Quantity must be greater than zero")
	    private double quantity;

	    @NotNull(message = "Item cannot be null")
	    private ItemDto item;
}
