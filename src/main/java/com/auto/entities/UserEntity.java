package com.auto.entities;

import java.util.ArrayList;

import java.util.List;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;

@Entity
@Table(name="users")
public class UserEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id;
	private String userId;
	private String firstName;
	private String lastName;
	
	private String phone;
	private String email;
	private String password;
	private String address;
	private String role;
	private String gender;
	
	@Transient
	private List<CustomerRequestEntity> request=new ArrayList<CustomerRequestEntity>();
	
	public UserEntity() {	
		super();	
		
	}

	public UserEntity(String userId, String firstName, String lastName, String phone, String email, String password,
			String address, String role, String gender, List<CustomerRequestEntity> request) {
		super();
		this.userId = userId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.address = address;
		this.role = role;
		this.gender = gender;
		this.request = request;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	
	}

	public List<CustomerRequestEntity> getRequest() {
		return request;
	}

	public void setRequest(List<CustomerRequestEntity> request) {
		this.request = request;
	}

	@Override
	public String toString() {
		return "UserEntity [Id=" + Id + ", userId=" + userId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", phone=" + phone + ", email=" + email + ", password=" + password + ", address=" + address
				+ ", role=" + role + ", gender=" + gender + ", request=" + request + "]";
	}
	

}
