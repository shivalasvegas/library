package com.qa.library;

import java.util.ArrayList;
import java.util.List;

public class Library {
	
	List<LibraryItems> mediumArray = new ArrayList<>();
	List<Users> usersArray = new ArrayList<>();
	int counterMedium = 0;
	int counterUser = 0;
	
	public void addMedium(LibraryItems libItem) {
		mediumArray.add(libItem);
		counterMedium ++;
		libItem.setId(counterMedium);
	}
	
	public void readLibraryItems() {
		for(LibraryItems libItem: mediumArray) {
			System.out.println(libItem);
		}
	}
	
	public void updateItemAuthor(int itemId, String author) {
		
		for(LibraryItems libItem: mediumArray) {
			
			if (itemId == libItem.getId()) {
				libItem.setAuthor(author);
				System.out.println("Udating Author to " + libItem.getAuthor());
			}
		}
		
	}

	
	public void addUser(Users user) {
		usersArray.add(user);
		counterUser ++;
		user.setId(counterUser);
	}
	
	public void readUserInfo() {
		for(Users user: usersArray) {
			System.out.println(user);
		}
	}




}
