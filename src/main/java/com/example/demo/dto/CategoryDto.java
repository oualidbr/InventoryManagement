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
public class CategoryDto {
	
    private Long id ;
    @NotBlank(message = "title cant be Balank")
    private String title;
    @NotBlank(message = "metaTitle cant be Balank")
    private  String metaTitle;

}
