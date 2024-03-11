package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.base.BaseService;
import com.example.demo.dto.AddressDto;
import com.example.demo.mapp.AddressMapper;
import com.example.demo.model.Address;
import com.example.demo.repository.AddressRepo;
@Service
public class AddressService extends BaseService<Address, Long, AddressRepo, AddressDto, AddressMapper> {

}
