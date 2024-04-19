package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.base.BaseController;
import com.example.demo.dto.SupplierDto;
import com.example.demo.service.SupplierService;

@RestController
@RequestMapping("/api/suppliers")
public class SupplierController extends BaseController<SupplierDto, Long, SupplierService> {

}
