package com.capgemini.Lab2;

public class CD extends MediaItem {
	private String artist,genre;

	public String getArtist() {
		return artist;
	}

	public CD(int id,String name,int copies,String artist,String genre,int runtime) {
		super(id,name,copies,runtime);
		this.artist=artist;
		this.genre=genre;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	@Override
	public void print() {
		System.out.println("Id : "+getId());
		System.out.println("Title : "+getName());
		System.out.println("Artist : "+getArtist());
		System.out.println("Genre : "+getGenre());
		System.out.println("Runtime : "+getRuntime()+" minutes");
		System.out.println("Copies : "+getCopies());
	}
}
