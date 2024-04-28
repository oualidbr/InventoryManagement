package com.example.demo.mapp;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.base.BaseMapper;
import com.example.demo.dto.AddressDto;
import com.example.demo.dto.SupplierDto;
import com.example.demo.model.Address;
import com.example.demo.model.Supplier;

@Component
public class SupplierMapper implements BaseMapper<SupplierDto, Supplier> {


	@Autowired
	private AddressMapper addressMapper;
	
	@Override
	public SupplierDto mapToDto(Supplier supplier) {
		if (supplier == null) {
			return null;
		}

		SupplierDto supplierDto = new SupplierDto();
		supplierDto.setId(supplier.getId());
		supplierDto.setFirstName(supplier.getFirstName());
		supplierDto.setLastName(supplier.getLastName());
		supplierDto.setMobile(supplier.getMobile());
		supplierDto.setEmail(supplier.getEmail());
		Set<AddressDto> addressDtos = new HashSet<>();
		supplier.getAddresses().forEach(addressDto -> addressDtos.add(addressMapper.mapToDto(addressDto)) );
		supplierDto.setAddresses(addressDtos);

		return supplierDto;
	}

	@Override
	public Supplier mapToEntity(SupplierDto supplierDto) {
		if (supplierDto == null) {
			return null;
		}

		Supplier supplier = new Supplier();
		supplier.setId(supplierDto.getId());
		supplier.setFirstName(supplierDto.getFirstName());
		supplier.setLastName(supplierDto.getLastName());
		supplier.setMobile(supplierDto.getMobile());
		supplier.setEmail(supplierDto.getEmail());
		Set<Address> addresses = new HashSet<>();
		supplierDto.getAddresses().forEach(address -> addresses.add(addressMapper.mapToEntity(address)));
		supplier.setAddresses(addresses);

		return supplier;
	}
}
