package com.auto.models;

public class LoginUserRequestModel {
	

	private String  email;
	private String password;
	public LoginUserRequestModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginUserRequestModel(String email, String password) {
		super();
		this.email = email;
		this.password = password;
	}
	public String getEmail() {
		return email;	
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "LoginUserRequestModel [email=" + email + ", password=" + password + "]";
	}
	
	
	
	
	
}
