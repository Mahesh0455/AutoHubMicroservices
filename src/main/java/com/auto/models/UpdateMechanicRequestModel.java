package com.auto.models;

public class UpdateMechanicRequestModel {

	private String firstName;
	private String lastName;
	private String mobile;	
	private String email;
	private String skills;
	private double salary;
	public UpdateMechanicRequestModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UpdateMechanicRequestModel(String firstName, String lastName, String mobile, String email, String skills,
			double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
		this.skills = skills;
		this.salary = salary;
	}
	
	
	
	
	
	
	
	
}
