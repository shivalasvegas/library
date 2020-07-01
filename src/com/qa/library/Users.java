package com.qa.library;

public class Users {
	
	private String userId;
	private String name;
	private String email;
	private String number;

	
	public Users() {
	
	}

	public Users(String userId, String name, String email, String number) {
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.number = number;

	}
	
	public Users(String userId) {
		this.userId = userId;	
	}
  
	public String getId() {
		return userId;  
	}
  
	public void setId(String userId) {
		this.userId = userId;  
	  }
  
	public String getName() {
		return name;
	  }
	
	public void setName(String name) {
		this.name = name;  
	  }
	
	
	public void setEmail(String email) {
	  this.email = email;
	}
	public String getEmail(){
	  return email;
	}
	  
		public void setNumber(String number) {
		  this.number = number;
		}
		public String getNumber(){
		  return number;
		}

}
