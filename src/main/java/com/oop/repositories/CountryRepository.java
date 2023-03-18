package com.oop.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oop.entities.CountryEntity;

public interface CountryRepository extends JpaRepository<CountryEntity, Serializable> {

}
