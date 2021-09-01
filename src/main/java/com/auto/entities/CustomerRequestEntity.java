package com.auto.entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="request")
public class CustomerRequestEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
		private int requestId;
		private String vehicleCategory;
		
		private String vehicleNumber;
		private String vehicleName;
		private String vehicleBrand;
		private String problemDescription;
	
		private String status;
		private String enquiryDate;	
		private double cost;
	
	@ManyToOne(cascade = CascadeType.ALL )
	 @JoinColumn(name ="user_ID")
	private UserEntity userEntity;

	public CustomerRequestEntity() {
		super();
	}

	public CustomerRequestEntity(String vehicleCategory, String vehicleNumber, String vehicleName, String vehicleBrand,
			String problemDescription, String status, String enquiryDate, double cost, UserEntity userEntity) {
		super();
		this.vehicleCategory = vehicleCategory;
		this.vehicleNumber = vehicleNumber;
		this.vehicleName = vehicleName;
		this.vehicleBrand = vehicleBrand;
		this.problemDescription = problemDescription;
		this.status = status;
		this.enquiryDate = enquiryDate;
		this.cost = cost;
		this.userEntity = userEntity;
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

	public UserEntity getUserEntity() {
		return userEntity;
	}

	public void setUserEntity(UserEntity userEntity) {
		this.userEntity = userEntity;
	}

	@Override
	public String toString() {
		return "CustomerRequestEntity [requestId=" + requestId + ", vehicleCategory=" + vehicleCategory
				+ ", vehicleNumber=" + vehicleNumber + ", vehicleName=" + vehicleName + ", vehicleBrand=" + vehicleBrand
				+ ", problemDescription=" + problemDescription + ", status=" + status + ", enquiryDate=" + enquiryDate
				+ ", cost=" + cost + ", userEntity=" + userEntity + "]";
	}

	

}
