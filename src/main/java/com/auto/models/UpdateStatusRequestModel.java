package com.auto.models;

public class UpdateStatusRequestModel {
	
	private int requestId;
	private String status;
	
	public UpdateStatusRequestModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UpdateStatusRequestModel(int requestId, String status, int userId) {
		super();
		this.requestId = requestId;
		this.status = status;
		
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	@Override
	public String toString() {
		return "UpdateStatusRequestModel [requestId=" + requestId + ", status=" + status + "]";
	}
	
	


}
