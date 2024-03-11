package com.example.demo.dto;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
	private Long id;
	private String firstName;
	private String lastName;
	private String Mobile;
	private String email;
	private Date birthday;
	private AddressDto addressDto;
}
