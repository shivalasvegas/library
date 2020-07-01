package com.qa.library;

class Books extends LibraryItems{
	
	private String itemId;
	private int year;
	private String author;
	private String title;
	
	public void noise() {
		System.out.println("BeepleBeep");
	}
	
	public Books() {
	
	}

	public Books(String itemId, int year, String title, String author) {
		this.itemId = itemId;
		this.year = year;
		this.title = title;
		this.author = author;
	}
	
	public Books(String itemId) {
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
  
	public void setAuthor(String author) {
	  this.author = author;
	}
	
	public String getAuthor(){
		return author;
	}
	
	public void setTitle(String title) {
	  this.title = title;
	}
	public String getTitle(){
	  return title;
	}
	  

}
