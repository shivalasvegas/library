package com.qa.library;

public class Newspapers extends LibraryItems{
	private int itemId;
	private int year;
	private String title;
	private String date;
	
	public Newspapers() {
	
	}

	public Newspapers(int itemId, int year, String title, String date) {
		this.itemId = itemId;
		this.year = year;
		this.title = title;

	}
	
	public Newspapers(int itemId) {
		this.itemId = itemId;	
	}
  
	public int getId() {
		return itemId;  
	}
  
	public void setId(int itemId) {
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
		
		public void noise() {
			System.out.println("BeopBeopBeop!");
		}
}
