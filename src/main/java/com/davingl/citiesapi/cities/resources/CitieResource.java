package com.davingl.citiesapi.cities.resources;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davingl.citiesapi.cities.entities.City;
import com.davingl.citiesapi.cities.repositories.CitieRepository;

@RestController
@RequestMapping("/cities")
public class CitieResource {
	
	@Autowired
	private CitieRepository repository;
	
	@GetMapping
	public Page<City> getAllCities(Pageable page) {
		
		return repository.findAll(page);
		
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<City> getCityByid(@PathVariable(name = "id") Long id) {
		
		Optional<City> optional = repository.findById(id);
		
		return optional.isPresent() ?
				ResponseEntity.ok().body(optional.get()) : ResponseEntity.notFound().build();
		
	}
	
}
