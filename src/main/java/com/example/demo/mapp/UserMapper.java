package com.example.demo.mapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.example.demo.base.BaseMapper;
import com.example.demo.dto.UserDto;
import com.example.demo.model.User;

@Component
public class UserMapper implements BaseMapper<UserDto, User> {

	@Autowired
	private AddressMapper addressMapper;

	@Override
	public UserDto mapToDto(User user) {
		if (user == null) {
			return null;
		}

		UserDto userDto = new UserDto();
		userDto.setId(user.getId());
		userDto.setFirstName(user.getFirstName());
		userDto.setLastName(user.getLastName());
		userDto.setMobile(user.getMobile());
		userDto.setEmail(user.getEmail());
		userDto.setBirthday(user.getBirthday());
		userDto.setAddressDto(addressMapper.mapToDto(user.getAddress()));

		return userDto;
	}

	@Override
	public User mapToEntity(UserDto userDto) {
		if (userDto == null) {
			return null;
		}

		User user = new User();
		user.setId(userDto.getId());
		user.setFirstName(userDto.getFirstName());
		user.setLastName(userDto.getLastName());
		user.setMobile(userDto.getMobile());
		user.setEmail(userDto.getEmail());
		user.setBirthday(userDto.getBirthday());
		user.setAddress(addressMapper.mapToEntity(userDto.getAddressDto()));

		return user;
	}

}
