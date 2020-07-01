package com.qa.library;

// like garage

import java.util.ArrayList;


public class Library {
	
	private ArrayList<String> itemArray = new ArrayList<String>();
	private ArrayList<String> userArray = new ArrayList<String>();

	
	public void checkInItem(String newItemId) {
		itemArray.add(newItemId);
		System.out.println("Checking in your item");
	}
	
	public void checkOutItem(String newItemId) {
		itemArray.remove(newItemId);
		System.out.println("Checking out your item");
	}
	
	public void updateItemAuthor(String author) {
		
		System.out.println("Udating Author to " + author);
	}
	
	public void updateItemTitle(String title) {
		
		System.out.println("Udating title to " + title);
	}

	public void addUser(String newUserId) {
		userArray.add(newUserId);
		System.out.println("Adding you to our system ... ");
	}
	
	public void deleteUser(String newUserId) {
		userArray.remove(newUserId);
		System.out.println("Deleting you from our system ...");
	}
	
	public void updateUserNumber(String number) {
		
		System.out.println("Udating your phone number to ... " + number);
	}
	
	public void updateUserEmail(String email) {
		
		System.out.println("Udating your email to ...  " + email);
	}


}
