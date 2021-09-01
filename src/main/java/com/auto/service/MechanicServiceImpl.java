package com.auto.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auto.dao.mechanicRepository;
import com.auto.entities.MechanicEntity;

@Service
public class MechanicServiceImpl implements MechanicService {
	
	@Autowired
	mechanicRepository mechanicRepo;
		
	@Override
	public MechanicEntity addMechanic(MechanicEntity mechanic) {
		
		MechanicEntity mechanicEntity=mechanicRepo.save(mechanic);
		
				
		return mechanicEntity;
	}

	@Override
	public String deleteMechanic(int mechanicId) {
		
		MechanicEntity mechanic=mechanicRepo.getById(mechanicId);
		
		mechanicRepo.delete(mechanic);
		return "mechanic deleted successfully";
	}

	@Override
	public List<MechanicEntity> getAllMechanic() {
		List<MechanicEntity> list=mechanicRepo.findAll();
		return list;
	}

	@Override
	public MechanicEntity updateMechanic(MechanicEntity mechanic) {
		
		MechanicEntity mech=mechanicRepo.getByMechanicId(mechanic.getMechanicId());
		
		mech.setFirstName(mechanic.getFirstName());
		mech.setLastName(mechanic.getLastName());
		mech.setEmail(mechanic.getEmail());
		mech.setMobile(mechanic.getMobile());
		mech.setSalary(mechanic.getSalary());
		mech.setSkills(mechanic.getSkills());
		
		mech=mechanicRepo.save(mech);
		
		return mech;
	}

	public MechanicEntity getSingleMechanic(int mechanicId) {
		
		MechanicEntity mechanic=mechanicRepo.getByMechanicId(mechanicId);
		return mechanic;
	}
	
	
}
