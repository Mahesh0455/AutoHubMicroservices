package com.auto.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auto.entities.UserEntity;

public interface UserRepositoryDao extends JpaRepository<UserEntity, Integer> {
	public UserEntity findByUserId(String userId);
	
}
