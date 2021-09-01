package com.auto.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.auto.entities.MechanicEntity;

public interface mechanicRepository extends JpaRepository<MechanicEntity, Integer>{
	
	public MechanicEntity getByMechanicId(int mechanicId);

}
 	