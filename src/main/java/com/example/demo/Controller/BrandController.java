package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.base.BaseController;
import com.example.demo.dto.BrandDto;
import com.example.demo.service.BrandService;

@RestController
@RequestMapping("/api/brands")
public class BrandController extends BaseController<BrandDto, Long, BrandService> {

}
