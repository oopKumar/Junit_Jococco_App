package com.oop.repositories;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.oop.entities.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, Serializable> {

	public UserEntity findByUserEmail(String userEmail);
}
