package com.qa.library;



public class LibraryRunner {

	public static void main(String[] args) {
		
		Library newTorrington = new Library();
		
		
		String idTest = "book";
		int yearTest = 1985;
		String titleTest = "first book";
		String authorTest = "Newick Granger";
		
		Books item1 = new Books(idTest, yearTest, titleTest, authorTest);
		
		item1.setAuthor("Lissy Ark");
		
		newTorrington.checkInItem(item1.getId());
		item1.noise();
		
		newTorrington.checkOutItem(item1.getId());
		item1.noise();
		
		newTorrington.updateItemAuthor(item1.getAuthor());
	}

}
