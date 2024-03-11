package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.base.BaseRepository;
import com.example.demo.model.Supplier;

@Repository
public interface SupplierRepo extends BaseRepository<Supplier, Long> {

}
