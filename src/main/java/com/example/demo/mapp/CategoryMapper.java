package com.example.demo.mapp;

import org.springframework.stereotype.Component;

import com.example.demo.base.BaseMapper;
import com.example.demo.dto.CategoryDto;
import com.example.demo.model.Category;
@Component
public class CategoryMapper implements BaseMapper<CategoryDto, Category> {

	@Override
	public CategoryDto mapToDto(Category category) {
		   if (category == null) {
	            return null;
	        }

	        CategoryDto categoryDto = new CategoryDto();
	        categoryDto.setId(category.getId());
	        categoryDto.setTitle(category.getTitle());
	        categoryDto.setMetaTitle(category.getMetaTitle());

	        return categoryDto;
	}

	@Override
	public Category mapToEntity(CategoryDto categoryDto) {
        if (categoryDto == null) {
            return null;
        }

        Category category = new Category();
        category.setId(categoryDto.getId());
        category.setTitle(categoryDto.getTitle());
        category.setMetaTitle(categoryDto.getMetaTitle());

        return category;
	}

}
