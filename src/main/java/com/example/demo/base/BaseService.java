package com.example.demo.base;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.EntityNotFoundException;
import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseService<ENTITY, ID extends Serializable, REPO extends BaseRepository<ENTITY, ID>, DTO, MAP extends BaseMapper<DTO, ENTITY>> {

	@Autowired
	private REPO repo;

	@Autowired
	private MAP map;

	public List<DTO> findAll() {
		List<ENTITY> entities = repo.findAll();
		return entities.stream().map(map::mapToDto).collect(Collectors.toList());
	}

	public DTO findById(ID id) {
		if (id == null) {
			throw new IllegalArgumentException("ID cannot be null");
		}
		ENTITY entity = repo.findById(id).orElseThrow(() -> new EntityNotFoundException("not found"));
		return map.mapToDto(entity);
	}

	public void save(DTO dto) {
		if (dto == null) {
			throw new IllegalArgumentException(" this class cannot be null");
		}
		ENTITY entity = map.mapToEntity(dto);
		repo.save(entity);
	}

	public DTO update(DTO dto) {
		if (dto == null) {
			throw new IllegalArgumentException(" this class cannot be null");
		}
		ENTITY entity = map.mapToEntity(dto);
		ENTITY entityUpdated = repo.save(entity);
		return map.mapToDto(entityUpdated);
	}

	public void delete(ID id) {
		if (id == null) {
			throw new IllegalArgumentException("ID cannot be null");
		}
		if (!repo.existsById(id)) {
			throw new EntityNotFoundException("not found");
		}
		
		repo.deleteById(id);
	}

}
