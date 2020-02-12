package com.capgemini.Lab2;

public class JournalPaper extends Book {
	private int year;

	public JournalPaper(int id, String name, String author, int copies,int year) {
		super(id, name, author, copies);
		this.year=year;
	}
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public void print() {
		System.out.println("Id : "+getId());
		System.out.println("Title : "+getName());
		System.out.println("Author : "+getAuthor());
		System.out.println("Copies : "+getCopies());
		System.out.println("Year : "+getYear());
	}
}
