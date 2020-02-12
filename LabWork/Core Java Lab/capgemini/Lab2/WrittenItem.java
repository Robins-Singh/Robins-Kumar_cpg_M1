package com.capgemini.Lab2;

public class WrittenItem extends Item {
	
	private String author;
	
	public WrittenItem(int id, String name, String author, int copies) {
		super(id,name,copies);
		this.author=author;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Override
	public void print() {
	}

}
