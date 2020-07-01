package com.qa.library;

public class Maps extends LibraryItems{
	private String itemId;
	private int year;
	private String title;
	
	public void noise() {
		System.out.println("Beeeeeep");
	}
	
	public Maps() {
	
	}

	public Maps(String itemId, int year, String title) {
		this.itemId = itemId;
		this.year = year;
		this.title = title;

	}
	
	public Maps(String itemId) {
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
	  
}
