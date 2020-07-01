package com.qa.library;

abstract class LibraryItems{
	
	public abstract void noise();
	
	public void checkInNoise() {
		System.out.println("BeepdeBeepBeep");
	}
	
	public void checkOutNoise() {
		System.out.println("BoopdeBooooopBoop");
	}
  
}
