package com.example.demo.mapp;

import org.springframework.stereotype.Component;

import com.example.demo.base.BaseMapper;
import com.example.demo.dto.BrandDto;
import com.example.demo.model.Brand;
@Component
public class BrandMapper  implements BaseMapper<BrandDto, Brand>{

	@Override
	public BrandDto mapToDto(Brand brand) {
        if (brand == null) {
            return null;
        }
        BrandDto brandDto = new BrandDto();
        brandDto.setTitle(brand.getTitle());
        brandDto.setSummary(brand.getSummary());

        return brandDto;
	}

	@Override
	public Brand mapToEntity(BrandDto brandDto) {
        if (brandDto == null) {
            return null;
        }

        Brand brand = new Brand();
        brand.setTitle(brandDto.getTitle());
        brand.setSummary(brandDto.getSummary());

        return brand;
	}

}
