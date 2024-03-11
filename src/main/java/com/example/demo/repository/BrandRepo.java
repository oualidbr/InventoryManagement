package com.example.demo.repository;

import com.example.demo.base.BaseRepository;
import com.example.demo.model.Brand;
import org.springframework.stereotype.Repository;

@Repository
public interface BrandRepo extends BaseRepository<Brand,Long> {
}
