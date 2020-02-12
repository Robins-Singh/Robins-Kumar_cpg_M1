package com.capgemini.Lab2;

public class Video extends MediaItem {
	private String director,genre;
	private int year;
	public Video(int id,String name,int copies,String director,String genre,int year,int runtime) {
		super(id,name,copies,runtime);
		this.director=director;
		this.genre=genre;
		this.year=year;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
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
		System.out.println("Director : "+getDirector());
		System.out.println("Genre : "+getGenre());
		System.out.println("Year : "+getYear());
		System.out.println("Runtime : "+getRuntime()+" minutes");
		System.out.println("Copies : "+getCopies());
	}
}
