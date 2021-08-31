package com.auto.models;

public class MakeRequestResponseModel {

	private int requestId;
	private String vehicleCategory;
	
	private String vehicleNumber;
	private String vehicleName;
	private String vehicleBrand;
	private String problemDescription;
	private String userId;
	private String status;
	private String enquiryDate;	
	private double cost;
	public MakeRequestResponseModel() {
		super();
		
	}
	public MakeRequestResponseModel(String vehicleCategory, String vehicleNumber, String vehicleName,
			String vehicleBrand, String problemDescription, String userId, String status, String enquiryDate,
			double cost) {
		super();
		this.vehicleCategory = vehicleCategory;
		this.vehicleNumber = vehicleNumber;
		this.vehicleName = vehicleName;
		this.vehicleBrand = vehicleBrand;
		this.problemDescription = problemDescription;
		this.userId = userId;
		this.status = status;
		this.enquiryDate = enquiryDate;
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "MakeRequestResponseModel [requestId=" + requestId + ", vehicleCategory=" + vehicleCategory
				+ ", vehicleNumber=" + vehicleNumber + ", vehicleName=" + vehicleName + ", vehicleBrand=" + vehicleBrand
				+ ", problemDescription=" + problemDescription + ", userId=" + userId + ", status=" + status
				+ ", enquiryDate=" + enquiryDate + ", cost=" + cost + "]";
	}
	public int getRequestId() {
		return requestId;
	}
	public void setRequestId(int requestId) {
		this.requestId = requestId;
	}
	public String getVehicleCategory() {
		return vehicleCategory;
	}
	public void setVehicleCategory(String vehicleCategory) {
		this.vehicleCategory = vehicleCategory;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getVehicleName() {
		return vehicleName;
	}
	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	public String getVehicleBrand() {
		return vehicleBrand;
	}
	public void setVehicleBrand(String vehicleBrand) {
		this.vehicleBrand = vehicleBrand;
	}
	public String getProblemDescription() {
		return problemDescription;
	}
	public void setProblemDescription(String problemDescription) {
		this.problemDescription = problemDescription;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEnquiryDate() {
		return enquiryDate;
	}
	public void setEnquiryDate(String enquiryDate) {
		this.enquiryDate = enquiryDate;
	}
	public double getCost() {
		return cost;
	}
	public void setCost(double cost) {
		this.cost = cost;
	}
	public MakeRequestResponseModel(int requestId, String vehicleCategory, String vehicleNumber, String vehicleName,
			String vehicleBrand, String problemDescription, String userId, String status, String enquiryDate,
			double cost) {
		super();
		this.requestId = requestId;
		this.vehicleCategory = vehicleCategory;
		this.vehicleNumber = vehicleNumber;
		this.vehicleName = vehicleName;
		this.vehicleBrand = vehicleBrand;
		this.problemDescription = problemDescription;
		this.userId = userId;
		this.status = status;
		this.enquiryDate = enquiryDate;
		this.cost = cost;
	}
	
	
		
}
