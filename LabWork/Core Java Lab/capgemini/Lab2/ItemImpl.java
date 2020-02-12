package com.capgemini.Lab2;

public class ItemImpl {

	public static void main(String[] args) {
		System.out.println("----Book----\n");
		Book b = new Book(101,"3 Men in a Boat","Jerom k Jerome",300);
		b.print();
		
		System.out.println("\n----Journal Paper----\n");
		JournalPaper j = new JournalPaper(102, "Cyber Security Essentials", "Punit Raj",500,2020);
		j.print();
		
		System.out.println("\n----Video----\n");
		Video v = new Video(103,"PK",250,"Rajkumar Hirani","Comedy",2008,160);
		v.print();
		
		System.out.println("\n----CD----\n");
		CD cd = new CD(103,"PK",1000,"Aamir Khan","Comedy",160);
		v.print();

	} 

}
