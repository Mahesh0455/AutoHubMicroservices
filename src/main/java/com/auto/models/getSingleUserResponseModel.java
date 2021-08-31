package com.auto.models;

public class getSingleUserResponseModel {
	private String firstName;
	private String lastName;
	private String userId;
	private String role;
	private String phone;
	private String address;
	
	public getSingleUserResponseModel() {
		super();
		
	}
	public getSingleUserResponseModel(String firstName, String lastName, String userId, String role, String phone,
			String address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userId = userId;
		this.role = role;
		this.phone = phone;
		this.address = address;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "ViewAllCustomersResponseModel [firstName=" + firstName + ", lastName=" + lastName + ", userId=" + userId
				+ ", role=" + role + ", phone=" + phone + ", address=" + address + "]";
	}
	
	
	
	
	
}
