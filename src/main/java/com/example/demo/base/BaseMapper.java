package com.example.demo.base;

public interface BaseMapper<DTO,ENTITY> {
	
	//map  Entity to Dto 
		DTO mapToDto(ENTITY entity);
	
	//map Dto to Entity 
		ENTITY mapToEntity(DTO dto);
	
	

}
