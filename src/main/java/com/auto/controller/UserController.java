package com.auto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.auto.dao.UserRepositoryDao;
import com.auto.entities.UserEntity;
import com.auto.models.CreateUserRequestModel;
import com.auto.models.CreateUserResponseModel;
import com.auto.models.LoginUserRequestModel;
import com.auto.models.LoginUserResponseModel;
import com.auto.models.UpdateUserRequestModel;
import com.auto.models.UpdateUserResponseModel;

import com.auto.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {
	@Autowired
	UserService userService;

	@PostMapping("/create")
	public ResponseEntity<CreateUserResponseModel> createUser(@RequestBody CreateUserRequestModel user) {
		CreateUserResponseModel returnValue = userService.createUser(user);

		if (returnValue != null) {
			return ResponseEntity.status(HttpStatus.OK).body(returnValue);
		} else {

			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
		}
		
	}

	@PostMapping("/login")
	public ResponseEntity<LoginUserResponseModel> loginUser(@RequestBody LoginUserRequestModel user) {
		LoginUserResponseModel returnValue = userService.authenticateUser(user);
		if (returnValue != null) {
			return ResponseEntity.status(HttpStatus.OK).body(returnValue);

		} else {

			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

		}

	}
	
	
	@PatchMapping("/update")
	public ResponseEntity<UpdateUserResponseModel> loginUser(@RequestBody UpdateUserRequestModel user) {
		UpdateUserResponseModel returnValue = userService.updateUser(user);
		if (returnValue != null) {
			return ResponseEntity.status(HttpStatus.OK).body(returnValue);

		} else {

			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);

		}	

	}
	@DeleteMapping("/delete")
	public ResponseEntity<String> deleteUser(@RequestHeader String userId){
		String returnValue=userService.deleteUser(userId);
		if(returnValue==null) {
				
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("user not found");
		}
		
		return ResponseEntity.status(HttpStatus.OK).body(returnValue);
		
	}
	
			
	@GetMapping("/getAllUser")
	public ResponseEntity<List<UserEntity>> getAllUsers(){
		
		List<UserEntity> list=userService.getAllCustomers();
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}
	
	@GetMapping("/getSingleUser")
	public ResponseEntity<UserEntity> getSingleUser(@RequestHeader String userId){
		
		
		UserEntity user=userService.getSingleUser(userId);
		
		if(user==null){
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(user);
		}else
		{
			return ResponseEntity.status(HttpStatus.OK).body(user);
		}
		
	}
	
	
	

}
