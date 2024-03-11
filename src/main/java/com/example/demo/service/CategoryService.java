package com.example.demo.service;

import com.example.demo.base.BaseService;
import com.example.demo.dto.CategoryDto;
import com.example.demo.mapp.CategoryMapper;
import com.example.demo.model.Category;
import com.example.demo.repository.CategoryRepo;
import org.springframework.stereotype.Service;

@Service
public class CategoryService extends BaseService<Category,Long, CategoryRepo,CategoryDto,CategoryMapper> {
}
