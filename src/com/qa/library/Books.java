package com.qa.library;

class Books extends LibraryItems{
		
	public Books() {
		super();	
	}
	
	public Books(int itemId, int year,  String title, String author) {
		super(itemId, year, title, author);
	}
	

	@Override
	public String toString() {
		return "Books [author=" + getAuthor() + ", getId()=" + getId() + ", getYear()=" + getYear() + ", getTitle()="
				+ getTitle() + "]";
	}

	public Books(int itemId) {
		super(itemId);
		// TODO Auto-generated constructor stub
	}

//	public void setAuthor(String author) {
//		  this.author = author;
//		}
//		
//		public String getAuthor(){
//			return author;
//		}
	
	public void noise() {
		System.out.println("BeepleBeep");
	}
	  

}
