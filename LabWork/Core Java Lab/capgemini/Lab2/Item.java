package com.capgemini.Lab2;

public abstract class Item {
	
	private int id;
	private String name;
	private int copies;
	public Item(int id, String name, int copies) {
		this.id=id;
		this.name=name;
		this.copies=copies;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCopies() {
		return copies;
	}
	public void setCopies(int copies) {
		this.copies = copies;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", copies=" + copies + "]";
	}
	public abstract void print();
}
