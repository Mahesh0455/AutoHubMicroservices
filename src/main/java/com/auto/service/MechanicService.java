package com.auto.service;

import java.util.List;

import com.auto.entities.MechanicEntity;

public interface MechanicService {
	public MechanicEntity addMechanic(MechanicEntity mechanic);
	
	public String deleteMechanic(int mechanicId);
	
	public List<MechanicEntity> getAllMechanic();
		
	public MechanicEntity updateMechanic(MechanicEntity mechanic);
	
	public MechanicEntity getSingleMechanic(int mechanicId);
	
}
