package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.base.BaseController;
import com.example.demo.dto.CategoryDto;
import com.example.demo.service.CategoryService;

@RestController
@RequestMapping("/api/categories")
public class CategoryController extends BaseController<CategoryDto, Long, CategoryService> {

}
