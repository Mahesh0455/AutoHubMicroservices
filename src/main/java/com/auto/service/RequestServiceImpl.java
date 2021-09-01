package com.auto.service;

import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.auto.dao.RequestRepositoryDao;
import com.auto.dao.UserRepositoryDao;
import com.auto.entities.CustomerRequestEntity;
import com.auto.entities.UserEntity;
import com.auto.models.MakeRequestRequestModel;
import com.auto.models.MakeRequestResponseModel;
import com.auto.models.UpdateStatusRequestModel;
import com.auto.models.updateCostRequestModel;

@Service
public class RequestServiceImpl implements RequestService {
	
	@Autowired
	RequestRepositoryDao requestDao;
	@Autowired
	UserRepositoryDao userDao;

	@Override
	public MakeRequestResponseModel addRequest(MakeRequestRequestModel request) {
		
		MakeRequestResponseModel responseModel=new ModelMapper().map(request, MakeRequestResponseModel.class);
		CustomerRequestEntity requestEntity=new CustomerRequestEntity();
		 requestEntity=new ModelMapper().map(request, CustomerRequestEntity.class);
		UserEntity user = userDao.getById(request.getUserId());
		requestEntity.setUserEntity(user);
		requestEntity.setStatus("pending");
		requestEntity.setCost(0.0);
		
		requestDao.save(requestEntity);
		
		return responseModel;
	}

	@Override
	public List<MakeRequestResponseModel> getRequestsByUser(int id) {
		UserEntity user = userDao.getById(id);
		List<CustomerRequestEntity> list=requestDao.findByUserEntity(user);
		List<MakeRequestResponseModel> responseList=new ArrayList<>();
		
		for(CustomerRequestEntity request:list) {
			responseList.add(new ModelMapper().map(request, MakeRequestResponseModel.class));
		}
		
		return responseList;
	}

	@Override
	public String updateStatusOfRequest(UpdateStatusRequestModel statusModel) {
			
		CustomerRequestEntity request=requestDao.getById(statusModel.getRequestId());
		request.setStatus(statusModel.getStatus());
		CustomerRequestEntity requestEntity=requestDao.save(request);
		if(requestEntity==null) {
			return null;
		}
		
		return "Status Updated Successfully";
	}

	@Override
	public String updateCostStatus(updateCostRequestModel costModel) {
		CustomerRequestEntity request=requestDao.getById(costModel.getRequestId());
		request.setStatus(costModel.getStatus());
		request.setCost(costModel.getCost());
		CustomerRequestEntity requestEntity=requestDao.save(request);
		if(requestEntity==null) {
			return null;
		}
		return "Cost Updated Successfully";
	}

	@Override
	public String deleteRequest(int requestId) {
		
		CustomerRequestEntity request=requestDao.getById(requestId);
		request.setUserEntity(null);
		requestDao.delete(request);
		
		return "Request Deleted Successfully";
	}

	@Override
	public List<CustomerRequestEntity> getPendingRequest(String status) {
		
		List<CustomerRequestEntity> list=requestDao.findByStatus(status);
		return list;
	}

	@Override
	public List<CustomerRequestEntity> getApprovedRequest(String status) {
		
		List<CustomerRequestEntity> list=requestDao.findByStatus(status);
		return list;
	}

	
	
	
	
	
	
		
}
  	