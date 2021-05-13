package com.davingl.citiesapi.countries.resources;


import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davingl.citiesapi.countries.entities.Country;
import com.davingl.citiesapi.countries.repositories.CountryRepository;

@RestController
@RequestMapping("/countries")
public class CountryResource {
	
	
	private CountryRepository repository;
	
	
	public CountryResource(CountryRepository repository) {
		this.repository = repository;
	}


	@GetMapping
	public Page<Country> getCountries(Pageable page){
		return repository.findAll(page);
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Country> getCountry(@PathVariable Long id) {
		
		Optional<Country> optional = repository.findById(id);
		
		return optional.isPresent() ? 
				ResponseEntity.ok().body(optional.get()) : ResponseEntity.notFound().build();
	}
	
	
}
