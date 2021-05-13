package com.davingl.citiesapi.cities.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davingl.citiesapi.cities.entities.City;

public interface CitieRepository extends JpaRepository<City, Long>{
	
	
	
}
