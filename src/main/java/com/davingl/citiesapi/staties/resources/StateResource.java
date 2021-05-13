package com.davingl.citiesapi.staties.resources;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.davingl.citiesapi.staties.entities.State;
import com.davingl.citiesapi.staties.repositories.StateRepository;


@RestController
@RequestMapping("/staties")
public class StateResource {
	
	
	private StateRepository repository;
	
	
	public StateResource(StateRepository repository) {
		this.repository = repository;
	}


	@GetMapping
	public Page<State> getStates(Pageable page){
		
		return repository.findAll(page);
				
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<State> getState(@PathVariable Long id) {
		
		Optional<State> optional = repository.findById(id);
		
		return optional.isPresent() ?
				ResponseEntity.ok().body(optional.get()) : ResponseEntity.notFound().build();
		
	}
	
}
