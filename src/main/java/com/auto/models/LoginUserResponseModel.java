package com.auto.models;

public class LoginUserResponseModel {

	private String firstName;
	private String lastName;
	private String userId;
	private String role;
	public LoginUserResponseModel() {
		super();
		
	}
	public LoginUserResponseModel(String firstName, String lastName, String userId, String role) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.userId = userId;
		this.role = role;
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
	@Override
	public String toString() {
		return "LoginUserResponseModel [firstName=" + firstName + ", lastName=" + lastName + ", userId=" + userId
				+ ", role=" + role + "]";
	}
	
	
	
	
}
