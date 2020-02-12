package com.capgemini.Lab2;

import java.util.Scanner;

public class Book extends WrittenItem {

	public Book(int id,String name,String author,int copies) {
		super(id,name,author,copies);
	}
	
	@Override
	public void print() {
		System.out.println("Id : "+getId());
		System.out.println("Title : "+getName());
		System.out.println("Author : "+getAuthor());
		System.out.println("Copies : "+getCopies());
	}
	
	

}
