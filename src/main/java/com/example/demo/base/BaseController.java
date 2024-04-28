package com.example.demo.base;

import java.io.Serializable;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.exception.NotFoundException;

import jakarta.validation.Valid;

@Component
public abstract class BaseController<DTO, ID extends Serializable, SERVICE extends BaseService<?, ID, ?, DTO, ?>> {

	@Autowired
	private SERVICE service;

	@GetMapping("/all")
	public ResponseEntity<List<DTO>> findAll() {
		try {
			List<DTO> dtos = service.findAll();
			return ResponseEntity.ok(dtos);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

	@GetMapping("/findById/{id}")
	public ResponseEntity<DTO> findById(@PathVariable ID id) {
		try {
			DTO dto = service.findById(id);

			return ResponseEntity.ok(dto);
		} catch (NotFoundException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		} catch (IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
	}

	@PostMapping
	public ResponseEntity<DTO> create(@RequestBody @Valid DTO dto) {
		service.save(dto);
		return ResponseEntity.status(HttpStatus.CREATED).body(dto);
	}

	@PutMapping
	public ResponseEntity<DTO> update(@RequestBody @Valid DTO dto) {
		try {
			DTO updatedDto = service.update(dto);
			return ResponseEntity.ok(updatedDto);
		} catch (NotFoundException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	}

	@DeleteMapping("/delete/{id}")
	public ResponseEntity<String> delete(@PathVariable ID id) {
		try {
			service.delete(id);
			return ResponseEntity.ok("Entity with ID: " + id + " deleted successfully");
		} catch (IllegalArgumentException e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(e.getMessage());
		} catch (NotFoundException e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(e.getMessage());
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(e.getMessage());
		}
	}
}
