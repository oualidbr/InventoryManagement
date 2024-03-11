package com.example.demo.mapp;

import org.springframework.stereotype.Component;

import com.example.demo.base.BaseMapper;
import com.example.demo.dto.AddressDto;
import com.example.demo.model.Address;

@Component
public class AddressMapper implements BaseMapper<AddressDto, Address> {

	@Override
	public AddressDto mapToDto(Address address) {
		if (address == null) {
			return null;
		}
		AddressDto addressDto = new AddressDto();
		addressDto.setId(address.getId());
		addressDto.setLine1(address.getLine1());
		addressDto.setLine2(address.getLine2());
		addressDto.setCity(address.getCity());
		addressDto.setProvince(address.getProvince());
		addressDto.setCountry(address.getCountry());

		return addressDto;
	}

	@Override
	public Address mapToEntity(AddressDto addressDto) {
		if (addressDto == null) {
			return null;
		}

		Address address = new Address();
		address.setId(addressDto.getId());
		address.setLine1(addressDto.getLine1());
		address.setLine2(addressDto.getLine2());
		address.setCity(addressDto.getCity());
		address.setProvince(addressDto.getProvince());
		address.setCountry(addressDto.getCountry());

		return address;
	}

}
