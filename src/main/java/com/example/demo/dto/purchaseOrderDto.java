package com.example.demo.dto;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
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

    @DecimalMin(value = "0.0", message = "Total price must be non-negative")
    private double totalPrice;

    @NotBlank(message = "Status cannot be blank")
    private String status;

    @NotNull(message = "Order date cannot be null")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date orderDate;

    @NotEmpty(message = "Order must contain at least one item")
    private Set<ItemOrderDto> itemOrderDtos = new HashSet<>();

    @NotNull(message = "User information must be provided")
    private UserDto userDto;
}
