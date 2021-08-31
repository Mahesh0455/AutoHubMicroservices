package com.auto.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auto.entities.CustomerRequestEntity;
import com.auto.entities.UserEntity;

public interface RequestRepositoryDao  extends JpaRepository<CustomerRequestEntity, Integer> {
	
	List<CustomerRequestEntity> findByUserEntity(UserEntity userEntity);
}
