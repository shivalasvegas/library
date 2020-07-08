package com.qa.library;



public class LibraryRunner {

	public static void main(String[] args) {
		
		Library newTorrington = new Library();
		
		newTorrington.addMedium(new Books(00, 1985, "1901", "Harold Ogar"));
		newTorrington.updateItemAuthor(1, "Lissy Hark");
		
		newTorrington.addMedium(new Books(00, 2019, "The Odd Fish", "Bream River"));
			
		newTorrington.readLibraryItems();
		
		newTorrington.addUser(new Users(00, "Mark Howell", "mmkh@go.com", "1234567"));
		newTorrington.readUserInfo();
		
	}

}
