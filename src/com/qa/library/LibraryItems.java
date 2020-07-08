package com.qa.library;

abstract class LibraryItems{
	
	private int itemId;
	private int year;
	private String title;
	private String author;
	
	//Constructors
	public LibraryItems() {
		
	}
	
	public LibraryItems(int itemId, int year,  String title) {
		this.itemId = itemId;
		this.year = year;
		this.title = title;
	}
	
	public LibraryItems(int itemId, int year,  String title, String author) {
		this.itemId = itemId;
		this.year = year;
		this.title = title;
		this.author = author;
	}
	
	public LibraryItems(int itemId) {
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
	
	public void setAuthor(String author) {
		  this.author = author;
		}
		
	public String getAuthor(){
		return author;
	}
	
	public abstract void noise();
	
	public void checkInNoise() {
		System.out.println("BeepdeBeepBeep");
	}
	
	public void checkOutNoise() {
		System.out.println("BoopdeBooooopBoop");
		
	}
}
