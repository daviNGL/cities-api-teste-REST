package com.davingl.citiesapi.states.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.davingl.citiesapi.states.entities.State;

public interface StateRepository extends JpaRepository<State, Long>{
	

}
