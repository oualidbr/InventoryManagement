package com.example.demo.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.base.BaseController;
import com.example.demo.dto.AddressDto;
import com.example.demo.service.AddressService;

@RestController
@RequestMapping("/api/address")
public class AddressController extends BaseController<AddressDto, Long, AddressService> {

}
