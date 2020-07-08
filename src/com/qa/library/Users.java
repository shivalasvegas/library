package com.qa.library;

public class Users {
	
	private int userId;
	private String name;
	private String email;
	private String number;

	
	public Users() {
	
	}

	public Users(int userId, String name, String email, String number) {
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.number = number;

	}
	
	
	
	@Override
	public String toString() {
		return "Users [userId=" + userId + ", name=" + name + ", email=" + email + ", number=" + number + "]";
	}

	public Users(int userId) {
		this.userId = userId;	
	}
  
	public int getId() {
		return userId;  
	}
  
	public void setId(int userId) {
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
