package com.oop.repositories;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oop.entities.CityEntity;

public interface CityRepository extends JpaRepository<CityEntity, Serializable>{

	public List<CityEntity> findByStateId(Integer stateId);
	
}
