package com.auto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.auto.models.MakeRequestRequestModel;
import com.auto.models.MakeRequestResponseModel;
import com.auto.models.UpdateStatusRequestModel;
import com.auto.models.updateCostRequestModel;
import com.auto.service.RequestService;


@RestController
@RequestMapping("/requests")
public class RequestController {
	@Autowired
	RequestService requestService;
	
	
	@PostMapping("/addRequest")
	public ResponseEntity<MakeRequestResponseModel> addRequest(@RequestBody MakeRequestRequestModel request){
		
		MakeRequestResponseModel responseModel=requestService.addRequest(request);
		
		
		return ResponseEntity.status(HttpStatus.OK).body(responseModel);
	}
	
	@PostMapping("/getAllRequests")
	public ResponseEntity<List<MakeRequestResponseModel>> getRequests(@RequestParam int id){
		
		List<MakeRequestResponseModel> list=requestService.getRequestsByUser(id);
		return ResponseEntity.status(HttpStatus.OK).body(list);
	}
	
	@PatchMapping("/updateStatus")
	public String updateRequestStatus(@RequestBody UpdateStatusRequestModel statusModel) {
		
		String returnValue=requestService.updateStatusOfRequest(statusModel);
		
		return returnValue;
		
	}
	
	@PatchMapping("/updateCostStatus")
	public String updateCostStatus(@RequestBody updateCostRequestModel costModel) {
		
		String returnValue=requestService.updateCostStatus(costModel);
		return returnValue;
		
	}
	
	public String deleteRequest(@RequestParam int requestId ) {
		
		
		return null;
	}
	

}
