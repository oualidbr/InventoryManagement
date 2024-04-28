package com.example.demo.dto;

import java.util.Date;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
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

    @NotBlank(message = "Name cannot be blank")
    private String name;

    private String description;

    @Min(value = 0, message = "Items in stock must be non-negative")
    private int itemInStock;

    @DecimalMin(value = "0.0", inclusive = false, message = "Printed price must be greater than 0")
    private double printedPrice;

    @DecimalMin(value = "0.0", inclusive = false, message = "Price must be greater than 0")
    private double price;

    @DecimalMin(value = "0.0", message = "Sell discount must be non-negative")
    @DecimalMax(value = "100.0", message = "Sell discount cannot exceed 100%")
    private double sellDiscount;

    @DecimalMin(value = "0.0", message = "Buy discount must be non-negative")
    @DecimalMax(value = "100.0", message = "Buy discount cannot exceed 100%")
    private double buyDiscount;

    @Min(value = 0, message = "Quantity must be non-negative")
    private int quantuty;

    private String QRCode; // Depending on QRCode requirements, add more constraints if needed

    @Min(value = 0, message = "Defective count must be non-negative")
    private int defective;

    private Date expiration; // Consider adding a future constraint if applicable

    @NotNull(message = "Supplier information must be provided")
    private SupplierDto supplierDto;

    @NotNull(message = "Brand information must be provided")
    private BrandDto brandDto;

    @NotNull(message = "Category information must be provided")
    private CategoryDto categoryDto;
}
