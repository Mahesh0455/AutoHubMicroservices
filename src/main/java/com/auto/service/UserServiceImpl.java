package com.auto.service;

import java.util.List;
import java.util.UUID;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auto.dao.UserRepositoryDao;
import com.auto.entities.UserEntity;
import com.auto.models.CreateUserRequestModel;
import com.auto.models.CreateUserResponseModel;
import com.auto.models.LoginUserRequestModel;
import com.auto.models.LoginUserResponseModel;
import com.auto.models.UpdateUserRequestModel;
import com.auto.models.UpdateUserResponseModel;
import com.auto.models.getSingleUserResponseModel;





@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepositoryDao userRepository;
	
	@Override
	public CreateUserResponseModel createUser(CreateUserRequestModel user) {
		
		CreateUserResponseModel responseModel=new ModelMapper().map(user, CreateUserResponseModel.class);
		
		UserEntity userEntity=new ModelMapper().map(user, UserEntity.class);
		String userId=UUID.randomUUID().toString();
		userEntity.setRole("customer");
		userEntity.setUserId(userId);
		userEntity=userRepository.save(userEntity);
		responseModel.setUserId(userId);
		if(userEntity!=null) {
			return responseModel;
		}else {
			return null;
		}
		
	}

	@Override
	public LoginUserResponseModel authenticateUser(LoginUserRequestModel user) {
		List<UserEntity> list=userRepository.findAll();
		
		for(UserEntity exstingUser:list) {
			if(exstingUser.getEmail().equals(user.getEmail()) && exstingUser.getPassword().equals(user.getPassword()) ) {
				
			LoginUserResponseModel  responseModel=new ModelMapper().map(exstingUser, LoginUserResponseModel.class);
			
			return responseModel;
			}
	
		}
		return null;
		
	}

	@Override
	public UpdateUserResponseModel updateUser(UpdateUserRequestModel user) {
		
		UserEntity userEntity=userRepository.findByUserId(user.getUserId());
		
		userEntity.setFirstName(user.getFirstName());
		userEntity.setLastName(user.getLastName());
		userEntity.setPhone(user.getPhone());
		userEntity.setAddress(user.getAddress());
		
		userEntity=userRepository.save(userEntity);
		
		UpdateUserResponseModel returnValue=new ModelMapper().map(userEntity, UpdateUserResponseModel.class);
		
		return returnValue;
	}

	@Override
	public String deleteUser(String userId) {
		UserEntity user=userRepository.findByUserId(userId);
		if(user==null)
		{
			return null;
		}
		userRepository.delete(user);
		
		return "success";
	}

	@Override
	public List<UserEntity> getAllCustomers() {
		List<UserEntity> userList=userRepository.findByRole("customer");
	
		return userList;
	}

	@Override
	public UserEntity getSingleUser(String userId) {
		UserEntity user=userRepository.findByUserId(userId);
		return user;
	}

	
	
	
	

		

}
