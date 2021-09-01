package com.auto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.auto.entities.MechanicEntity;
import com.auto.service.MechanicService;

@RestController
@RequestMapping("/mechanic")
@CrossOrigin(origins = "http://localhost:3000")
public class MechanicController {
	
	@Autowired
	MechanicService mechanicService;
	
	@PostMapping("/addMechanic")
	public ResponseEntity<MechanicEntity> addMechanic(@RequestBody MechanicEntity mechanic){
		
		MechanicEntity returnvalue=mechanicService.addMechanic(mechanic);
		if(returnvalue==null) {
			return	ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
		}
	 return	ResponseEntity.status(HttpStatus.OK).body(returnvalue);
	 	
	}
	
	@DeleteMapping("/deleteMechanic")
	public String deleteMechanic(@RequestHeader int mechanicId) {
		
		
		String returnValue=mechanicService.deleteMechanic(mechanicId);
		
		return returnValue; 	

	}
	
	@PostMapping("/getAllMechanic")
	public List<MechanicEntity> getAllMechanic(){
		
		List<MechanicEntity> list=mechanicService.getAllMechanic();
		
		return list;
		
	}
	
	
	@PatchMapping("/updateMechanic")
	public MechanicEntity updateMechanic(@RequestBody MechanicEntity mechanic) {
		
		MechanicEntity updatedMechanic=mechanicService.updateMechanic(mechanic);
		
		return updatedMechanic;
	}
	
	
	@PostMapping("/getSingleMechanic")
	public MechanicEntity getSingleMechanic(@RequestHeader int mechanicId) {
		
		MechanicEntity mechanic=mechanicService.getSingleMechanic(mechanicId);
		return mechanic;
	}
	
}
