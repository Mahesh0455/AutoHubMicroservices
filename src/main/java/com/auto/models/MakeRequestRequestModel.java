package com.auto.models;



public class MakeRequestRequestModel {

	private String vehicleCategory;
	private String vehicleNumber;
	private String vehicleName;
	private String vehicleBrand;
	private String problemDescription;
	
	private int userId;
	
	private String enquiryDate;	
	
	
	public MakeRequestRequestModel() {
		super();
		
	}


	public MakeRequestRequestModel(String vehicleCategory, String vehicleNumber, String vehicleName,
			String vehicleBrand, String problemDescription, int userId, String enquiryDate) {
		super();
		this.vehicleCategory = vehicleCategory;
		this.vehicleNumber = vehicleNumber;
		this.vehicleName = vehicleName;
		this.vehicleBrand = vehicleBrand;
		this.problemDescription = problemDescription;
		this.userId = userId;
		this.enquiryDate = enquiryDate;
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


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getEnquiryDate() {
		return enquiryDate;
	}


	public void setEnquiryDate(String enquiryDate) {
		this.enquiryDate = enquiryDate;
	}


	@Override
	public String toString() {
		return "MakeRequestRequestModel [vehicleCategory=" + vehicleCategory + ", vehicleNumber=" + vehicleNumber
				+ ", vehicleName=" + vehicleName + ", vehicleBrand=" + vehicleBrand + ", problemDescription="
				+ problemDescription + ", userId=" + userId + ", enquiryDate=" + enquiryDate + "]";
	}


	
	
	
	
	
	
	
	
}
