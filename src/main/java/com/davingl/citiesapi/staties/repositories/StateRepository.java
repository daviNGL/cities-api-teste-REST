package com.davingl.citiesapi.staties.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davingl.citiesapi.staties.entities.State;

public interface StateRepository extends JpaRepository<State, Long>{
	

}
