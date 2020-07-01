package com.qa.library;

public class Newspapers extends LibraryItems{
	private String itemId;
	private int year;
	private String title;
	private String date;
	
	public void noise() {
		System.out.println("BeopBeopBeop!");
	}
	
	public Newspapers() {
	
	}

	public Newspapers(String itemId, int year, String title, String date) {
		this.itemId = itemId;
		this.year = year;
		this.title = title;

	}
	
	public Newspapers(String itemId) {
		this.itemId = itemId;	
	}
  
	public String getId() {
		return itemId;  
	}
  
	public void setId(String itemId) {
		this.itemId = itemId;  
	  }
  
	public int getYear() {
		return year;
	  }
	
	public void setTitle(String title) {
	  this.title = title;
	}
	public String getTitle(){
	  return title;
	}
	  
		public void setDate(String date) {
		  this.date = date;
		}
		public String getDate(){
		  return date;
		}
}
