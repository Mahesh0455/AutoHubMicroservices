package com.auto.service;



import java.util.List;

import com.auto.entities.UserEntity;
import com.auto.models.CreateUserRequestModel;
import com.auto.models.CreateUserResponseModel;
import com.auto.models.LoginUserRequestModel;
import com.auto.models.LoginUserResponseModel;
import com.auto.models.UpdateUserRequestModel;
import com.auto.models.UpdateUserResponseModel;
import com.auto.models.getSingleUserResponseModel;

public interface UserService {
	
	public CreateUserResponseModel createUser(CreateUserRequestModel user);

	public LoginUserResponseModel authenticateUser(LoginUserRequestModel user);

	public UpdateUserResponseModel updateUser(UpdateUserRequestModel user);
	
	public String deleteUser(String userId);
	
	public List<UserEntity> getAllCustomers();
	
	public UserEntity getSingleUser(String userId);
	
	
		
	
	
	
		
	
}
