package com.davingl.citiesapi.countries.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.davingl.citiesapi.countries.entities.Country;

public interface CountryRepository extends JpaRepository<Country, Long> {

	
}
