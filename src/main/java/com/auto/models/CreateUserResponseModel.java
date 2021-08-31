package com.auto.models;

public class CreateUserResponseModel {

		String firstName;
		String lastName;
		private String gender;
		private String userId;
		public CreateUserResponseModel() {
			super();
			
		}
		public CreateUserResponseModel(String firstName, String lastName, String gender, String userId) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.gender = gender;
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
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getUserId() {
			return userId;
		}
		public void setUserId(String userId) {
			this.userId = userId;
		}
		@Override
		public String toString() {
			return "CreateUserResponseModel [firstName=" + firstName + ", lastName=" + lastName + ", gender=" + gender
					+ ", userId=" + userId + "]";
		}
		
		
		
		
}
