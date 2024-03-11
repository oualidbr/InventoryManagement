package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.base.BaseService;
import com.example.demo.dto.SupplierDto;
import com.example.demo.mapp.SupplierMapper;
import com.example.demo.model.Supplier;
import com.example.demo.repository.SupplierRepo;

@Service
public class SupplierService extends BaseService<Supplier, Long, SupplierRepo, SupplierDto, SupplierMapper> {

}
