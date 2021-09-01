package com.auto.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "mechanic")
public class MechanicEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int mechanicId;
	private	String firstName;
	private String lastName;
	private String mobile;	
	private String email;
	private String skills;
	private double salary;

	public MechanicEntity() {
		super();

	}

	public MechanicEntity(int mechanicId, String firstName, String lastName, String mobile, String email, String skills,
			double salary) {
		super();
		this.mechanicId = mechanicId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
		this.skills = skills;
		this.salary = salary;
	}

	public MechanicEntity(String firstName, String lastName, String mobile, String email, String skills,
			double salary) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.mobile = mobile;
		this.email = email;
		this.skills = skills;
		this.salary = salary;
	}

	public int getMechanicId() {
		return mechanicId;
	}

	public void setMechanicId(int mechanicId) {
		this.mechanicId = mechanicId;
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

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSkills() {
		return skills;
	}

	public void setSkills(String skills) {
		this.skills = skills;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "MechanicEntity [mechanicId=" + mechanicId + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", mobile=" + mobile + ", email=" + email + ", skills=" + skills + ", salary=" + salary + "]";
	}

}
