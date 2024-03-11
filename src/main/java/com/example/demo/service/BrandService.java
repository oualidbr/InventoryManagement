package com.example.demo.service;

import com.example.demo.base.BaseService;
import com.example.demo.dto.BrandDto;
import com.example.demo.mapp.BrandMapper;
import com.example.demo.model.Brand;
import com.example.demo.repository.BrandRepo;
import org.springframework.stereotype.Service;

@Service
public class BrandService extends BaseService<Brand,Long,BrandRepo,BrandDto,BrandMapper> {
}
