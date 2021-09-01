package com.auto.service;



import java.util.List;

import com.auto.entities.CustomerRequestEntity;
import com.auto.models.MakeRequestRequestModel;
import com.auto.models.MakeRequestResponseModel;
import com.auto.models.UpdateStatusRequestModel;
import com.auto.models.updateCostRequestModel;

public interface RequestService {

	public MakeRequestResponseModel addRequest(MakeRequestRequestModel request);
	
	List<MakeRequestResponseModel> getRequestsByUser(int id);
	
	public String updateStatusOfRequest(UpdateStatusRequestModel statusModel);
	
	public String updateCostStatus(updateCostRequestModel costModel);
	
	public String deleteRequest(int requestId);
	
	public List<CustomerRequestEntity> getPendingRequest(String status);
			
}
